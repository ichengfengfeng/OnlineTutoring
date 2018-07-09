package com.icff.tutoring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.icff.tutoring.dto.StuAnnouncementDto;
import com.icff.tutoring.po.Appointment;
import com.icff.tutoring.po.Area;
import com.icff.tutoring.po.Grade;
import com.icff.tutoring.po.Messages;
import com.icff.tutoring.po.Stuannouncement;
import com.icff.tutoring.po.Student;
import com.icff.tutoring.po.Tutorialclasstype;
import com.icff.tutoring.po.User;
import com.icff.tutoring.service.IuserService;
import com.icff.tutoring.util.Log;

@Controller
public class StudentController {
	@Autowired
	private IuserService userService;
	@RequestMapping(value="getStu",method=RequestMethod.GET)
	public String getStu(ModelMap modelmap) {
		
		try {
			List<Area> areas = userService.getSuperArea();
			List<Tutorialclasstype> tutors = userService.getAllTutorialclasstypes() ;
			List<Grade> grades = userService.getAllGrade();
			List<StuAnnouncementDto> stuannoDtos = userService.serchStuAnnounByStuAnnounDto(new StuAnnouncementDto());
			modelmap.addAttribute("tutors", tutors);
			modelmap.addAttribute("areas", areas);
			modelmap.addAttribute("grades", grades);
			modelmap.addAttribute("stuannoDtos", stuannoDtos);
			
		} catch (Exception e) {
			Log.logger.error("预约学员页面加载异常");
			e.printStackTrace();
			return "error.html";
		}
		
		return "front/student.jsp";
	}
	@RequestMapping(value = "getStuTable",method = RequestMethod.POST)
	public @ResponseBody List<StuAnnouncementDto> getStuTable(StuAnnouncementDto stuAnnouncementDto) {
		try {
			List<StuAnnouncementDto> stuannoDtos = userService.serchStuAnnounByStuAnnounDto(stuAnnouncementDto);
			return stuannoDtos;
		} catch (Exception e) {
			Log.logger.error("请求公告表格异常");
			e.printStackTrace();
		}
		return new ArrayList<>();
	}
	@RequestMapping(value = "user/asStudent",method = RequestMethod.GET )
	public String asStudent(ModelMap modelmap) {
		try {
			List<Area> areas = userService.getSuperArea();
			List<Tutorialclasstype> tutors = userService.getAllTutorialclasstypes() ;
			List<Grade> grades = userService.getAllGrade();
			modelmap.addAttribute("areas", areas);
			modelmap.addAttribute("tutors", tutors);
			modelmap.addAttribute("grades", grades);
		} catch (Exception e) {
			Log.logger.error("学员发布信息页面加载异常");
			e.printStackTrace();
			return "error.html";
		}
		
		return "front/asStudent.jsp";
	}
	@RequestMapping(value = "user/studentform",method = RequestMethod.POST)
	public ModelAndView studentForm(ModelAndView modelandview,HttpSession session,Stuannouncement stuanno) {
		try {
			Object obj = session.getAttribute("user");
			User user;
			if(obj != null) {
				user = (User)obj;
			    if(!userService.checkISStudent(user.getUuid())) {
			    	modelandview.setViewName("redirect:/login");
					return modelandview; //登录
			    }
			}else {
				modelandview.setViewName("redirect:/login");
				return modelandview; //登录
			}
			Student stu = new Student();
			stu.setStuuuid(user.getUuid());
			stu = userService.queryAndInsert(stu);
			stuanno.setStuuuid(user.getUuid());
			int num = userService.insertStuAnnouncement(stuanno);
			if(num>0) {
				modelandview.setViewName("redirect:/getStu");
				return modelandview;
			}
		} catch (Exception e) {
			Log.logger.error("发布学员消息错误");
			e.printStackTrace();
			modelandview.setViewName("redirect:/user/asStudent");
			return modelandview;
		}
		modelandview.setViewName("redirect:/user/asStudent");
		return modelandview;
		
	}
	@RequestMapping("updateuserinfo")
	public String updateuserinfo(Model model) {
		model.addAttribute("ifreamid","1");
		return "front/accountSetting1.jsp";
	}
	@RequestMapping("user/addmessage")
	@ResponseBody
	public String addMessage(HttpSession httpsession,String mcontent,String teacuuid) {
		Object obj = httpsession.getAttribute("user");
		User user;
		if (obj != null) {
			user = (User)obj ;
		}else {
			return "login";//未登录
		}
		try {
			if(!userService.checkISStudent(user.getUuid())) {
				return "notStudent";//非学员
			}
			Messages message = new Messages();
			message.setStuuuid(user.getUuid());
			message.setDescription(mcontent);
			message.setTeacuuid(teacuuid);
			userService.insertMessage(message);
			return "success";
		} catch (Exception e) {
			Log.logger.error("留言失败");
			e.printStackTrace();
			return "failed";
		}
		
	}
	
	@RequestMapping(value="user/stuappoint")
	public @ResponseBody String appointStu(@RequestParam("teacuuid")String teacuuid,
			HttpSession httpsession) {
		Object obj = httpsession.getAttribute("user");
		User user;
		if (obj != null) {
			user = (User)obj ;
		}else {
			return "login";//未登录
		}
		try {
			if(!userService.checkISStudent(user.getUuid()))
				return "notstudent";//非学员登录
			Appointment appointment = new Appointment();
			appointment.setStuuuid(user.getUuid());
			appointment.setTeacuuid(teacuuid);
			userService.insertAppointment(appointment);
		} catch (Exception e) {
			Log.logger.error("预约教员失败");
			e.printStackTrace();
			return "failed";
		}
		
		return "success";
	}


}
