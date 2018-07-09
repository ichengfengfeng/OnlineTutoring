package com.icff.tutoring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icff.tutoring.dto.AnnouncementDto;
import com.icff.tutoring.dto.MessagesDto;
import com.icff.tutoring.po.Announcement;
import com.icff.tutoring.po.Appointment;
import com.icff.tutoring.po.Area;
import com.icff.tutoring.po.School;
import com.icff.tutoring.po.Teacher;
import com.icff.tutoring.po.Tutorialclasstype;
import com.icff.tutoring.po.User;
import com.icff.tutoring.service.IuserService;
import com.icff.tutoring.util.Log;


@Controller
public class TeacherController {
	@Autowired
	private IuserService userService;
	
	@RequestMapping(value = "getTutor",method = RequestMethod.GET)
	public String getTutor(ModelMap modelmap) {
		try {
			List<Area> areas = userService.getSuperArea();
			List<Tutorialclasstype> tutors = userService.getAllTutorialclasstypes() ;
			List<School> schools = userService.getAllSchool();
			List<AnnouncementDto> annodtos = userService.searchAnnounByAnnounDto(new AnnouncementDto());
//			for(AnnouncementDto annodto:annodtos) {
//				List<Area> Dtoareas = userService.getSuperAreaByid(annodto.getId());
//				annodto.setAreas(Dtoareas);
//			}
			modelmap.addAttribute("annodtos", annodtos);
			modelmap.addAttribute("schools", schools);
			modelmap.addAttribute("tutors", tutors);
			modelmap.addAttribute("areas", areas);
		} catch (Exception e) {
			Log.logger.error("预约教师页面加载异常");
			e.printStackTrace();
			return "error.html";
		}
		return "front/qing.jsp";
	}
	@RequestMapping(value = "getTable",method = RequestMethod.POST)
	public @ResponseBody List<AnnouncementDto> getAnnouncementDtos(Model model,AnnouncementDto annoDto) {
		
		try {
			List<AnnouncementDto> annodtos = userService.searchAnnounByAnnounDto(annoDto);
			return annodtos;
		} catch (Exception e) {
			Log.logger.error("请求公告表格异常");
			e.printStackTrace();
		}
		return new ArrayList<>();
	}
	@RequestMapping(value = "superAreachange",method = RequestMethod.POST)
	public @ResponseBody List<Area> superAreachange(@RequestParam("superAreaid") int superAreaid) {
		List<Area> lowerAreas = new ArrayList<Area>();
		try {
			lowerAreas= userService.getLowerArea(superAreaid);
			
		} catch (Exception e) {
			Log.logger.error("二级联动失败");
			e.printStackTrace();
		}
		return lowerAreas;
		
	}
	/**
	 * 做家教
	 * @return
	 */
	@RequestMapping(value="user/asTutor",method = RequestMethod.GET)
	public String asTutor(Model model) {
		try {
			List<Area> areas = userService.getSuperArea();
			for (Area area : areas) {
				area.setAllAreas(userService.getLowerAreaBySuperid(area.getId()));
			}
			List<Tutorialclasstype> tutors = userService.getAllSuperTutorialclasstypes();
			for (Tutorialclasstype tutor :tutors) {
				tutor.setTutorialclasstypes(userService.getLowerTutorialclasstypes(tutor.getTypeid()));
			}
			List<School> schools = userService.getAllSchool();
			model.addAttribute("areas", areas);
			model.addAttribute("schools", schools);
			model.addAttribute("tutors", tutors);
		} catch (Exception e) {
			Log.logger.error("做家教页面加载失败");
			e.printStackTrace();
			return "error.html";
		}
		return "front/asTutor.jsp";
	}
	@RequestMapping(value="user/tutorForm/{version}",method=RequestMethod.POST)
	public @ResponseBody String asTutor(String price,String school,String title,HttpSession httpsession,
			@RequestParam(value="tutorialclasstype[]",required=false) String[] tutorialclasstype,
			@RequestParam(value="quyu[]",required=false) String[] quyu,@PathVariable int version) {
		if (version != 1)
			return "repeat";
		try {
		Object obj = httpsession.getAttribute("user");
		User user;
		if (obj != null) {
			user = (User)obj ;
			if(!userService.checkISTeacher(user.getUuid())) {
				return "login";
			}
		}else {
			return "login";
		}
		String uuid = user.getUuid();
		Teacher teacher = new Teacher();
		teacher.setTeacuuid(uuid);
		teacher.setPrice(Double.parseDouble(price));
		teacher.setScuuid(school);
		List<Announcement> announcements = new ArrayList<>();
		int i = quyu.length;
		int j = tutorialclasstype.length;
		while(i>0 || j>0) {
			if (i!=0)
				i--;
			if(j!=0)
				j--;
			Announcement announcement = new Announcement();
			announcement.setAnnoid(UUID.randomUUID().toString());
			announcement.setUuid(uuid);
			announcement.setTypeid(tutorialclasstype[j]);
			announcement.setId(Integer.valueOf(quyu[i]));
			announcement.setTitle(title);
			announcement.setDescription("");
			announcement.setYxbz("Y");
			announcements.add(announcement);
			
		}
			boolean succ = userService.workAsTutor(announcements, teacher);
			return String.valueOf(succ);
		} catch (Exception e) {
			e.printStackTrace();
			return String.valueOf(false);
		}
		
	}
	@RequestMapping(value="user/appoint")
	public @ResponseBody String appointStu(@RequestParam("stuannouuid")String stuannouuid,
			@RequestParam("stuuuid")String stuuuid,
			HttpSession httpsession) {
		Object obj = httpsession.getAttribute("user");
		User user;
		if (obj != null) {
			user = (User)obj ;
		}else {
			return "login";//未登录
		}
		try {
			if(!userService.checkISTeacher(user.getUuid()))
				return "notteacher";//非教员登录
			Appointment appointment = new Appointment();
			appointment.setStuannouuid(stuannouuid);
			appointment.setStuuuid(stuuuid);
			appointment.setTeacuuid(user.getUuid());
			userService.insertAppointment(appointment);
		} catch (Exception e) {
			Log.logger.error("预约学员失败");
			e.printStackTrace();
			return "failed";
		}
		
		return "success";
	}
	@RequestMapping(value="tercherinfo/{teacuuid}",method=RequestMethod.GET)
	public String tercherinfo(@PathVariable String teacuuid,Model model) {
		AnnouncementDto annoDto = new AnnouncementDto();
		annoDto.setTeacuuid(teacuuid);
		MessagesDto message = new MessagesDto();
		message.setTeacuuid(teacuuid);
		message.setYxbz("Y");
		try {
			List<AnnouncementDto> annodtos = userService.searchAnnounByAnnounDto(annoDto);
			List<MessagesDto> messages = userService.queryMessages(message);
			model.addAttribute("messages", messages);
			model.addAttribute("teacher", annodtos.get(0));
		} catch (Exception e) {
			Log.logger.error("查看教员信息失败");
			e.printStackTrace();
			return "front/error.jsp";
		}
		
		return "front/teacherinfo.jsp";
	}
}
