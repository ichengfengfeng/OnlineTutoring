package com.icff.tutoring.controller;
import java.io.File;
/**
 * 用户账号控制
 * @author iCff
 *
 */
import java.util.List;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.icff.tutoring.constant.AppointmentState;
import com.icff.tutoring.dto.AppointmentDto;
import com.icff.tutoring.po.Appointment;
import com.icff.tutoring.po.User;
import com.icff.tutoring.service.IAccService;
import com.icff.tutoring.service.IuserService;
import com.icff.tutoring.util.Log;
import com.icff.tutoring.util.UUIDutil;
@Controller
public class AccountController {
	@Autowired
	IAccService accService;
	@Autowired
	IuserService userService;
	
	private static final String path="E:\\img\\pic\\";
	@RequestMapping(value="/accountSetting",method=RequestMethod.GET)
	public String acsetting( Model model,@RequestParam(required=false)String ifreamid) {
		model.addAttribute("ifreamid", ifreamid);
		return "front/accountSetting1.jsp";
	}
	@RequestMapping(value="user/updatePassword",method=RequestMethod.GET)
	public String updatePassword(HttpSession httpsession) {
		Object obj = httpsession.getAttribute("user");
		if (obj == null) 
			return "front/gologin.jsp";
		return "front/changepaw.jsp";
	}
	@RequestMapping(value="user/updatePassword",method=RequestMethod.POST)
	public @ResponseBody String updatePassword(HttpSession httpsession,String qrpassword) {
		if (qrpassword != null) {
			//获得session中的user对象，使用拦截器验证登录。
			Object obj = httpsession.getAttribute("user");
			User user;
			if (obj != null) {
				user = (User)obj ;
			}else {
				return "login";
			}
			User newuser = new User();
 			newuser.setUuid(user.getUuid());
			newuser.setPassword(qrpassword);
			try {
				int count = accService.updateUserByUser(newuser);
				if (count > 0) 
				return "1";	
			} catch (Exception e) {
				Log.logger.error("修改密码失败");
				e.printStackTrace();
				return "2";
			}
			
		}
		return "2";
	}
	/**
	 * 校验原始密码是否正确
	 * @param password
	 * @return
	 */
	@RequestMapping(value="user/checkPassword")
	public @ResponseBody String checkPassword(HttpSession httpsession,String password) {
		if (password != null && !"".equals(password)) {
			User user = (User) httpsession.getAttribute("user");
			try {
				user = accService.queryUserByuuidAndpassword(user.getUuid(), password);
				
			} catch (Exception e) {
				return "2";
			}
			if (user != null) 
				return "1";
		}
		return "2";
	}
	@RequestMapping(value="/user/confirm")
	public String confirmAppoint(Model model,HttpSession httpsession) {
		Object obj = httpsession.getAttribute("user");
		User user;
		if (obj != null) {
			user = (User)obj ;
		}else {
			return "front/gologin.jsp";
		}
		try {
			Appointment appointment = new Appointment();
			appointment.setState(AppointmentState.TO_BE_CONFIRM);
			if(userService.checkISTeacher(user.getUuid())) {
				appointment.setTeacuuid(user.getUuid());
				List<AppointmentDto> appointmentDtos = accService.confirmAppointInfo(appointment);
				model.addAttribute("appointmentDtos", appointmentDtos);
				return "front/confirmappoint.jsp";
			}else if(userService.checkISStudent(user.getUuid())){
				appointment.setStuuuid(user.getUuid());
				List<AppointmentDto> appointmentDtos = accService.confirmstuAppointInfo(appointment);
				model.addAttribute("appointmentDtos", appointmentDtos);
				return "front/stuconfirmappoint.jsp";
			}
			
		} catch (Exception e) {
			Log.logger.error("查询待确认预约记录失败");
			e.printStackTrace();
		}
		return "front/confirmappoint.jsp";
	}
	@RequestMapping("user/personinfo")
	public String personInfo() {
		return "front/personinfo.jsp";
	}
	@RequestMapping(value="user/confirmbutton/{appointmentid}")
	public String confirmbutton(@PathVariable String appointmentid,Model model) {
		model.addAttribute("appointmentid", appointmentid);
		return "front/confirmbutton.jsp";
	}
	@RequestMapping(value="user/confirmsub")
	public @ResponseBody String confirmsubmit(Appointment appointment) {
		try {
			appointment.setState(AppointmentState.SUCCESSFUL_APPOINTMENT);
			accService.updateAppointment(appointment);
		} catch (Exception e) {
			Log.logger.error("确认预约添加开始结束时间错误");
			e.printStackTrace();
			return "failed";
		}
		return "success";
	}
	@RequestMapping("user/cancle")
	public @ResponseBody String calcleConfirm(@RequestParam(name="appointmentid")String appointmentid) {
		Appointment appointment = new Appointment();
		appointment.setAppointmentid(appointmentid);
		appointment.setState(AppointmentState.Canceled);
		try {
			accService.updateAppointment(appointment);
		} catch (Exception e) {
			Log.logger.error("取消预约错误");
			e.printStackTrace();
			return "failed";
		}
		return "success";
		
	}
	@RequestMapping("user/canceled")
	public String canceled(Model model,HttpSession httpsession) {
		Object obj = httpsession.getAttribute("user");
		User user;
		if (obj != null) {
			user = (User)obj ;
		}else {
			return "front/gologin.jsp";
		}
		Appointment appointment = new Appointment();
		appointment.setState(AppointmentState.Canceled);
		try {
			if(userService.checkISTeacher(user.getUuid())) {
				appointment.setTeacuuid(user.getUuid());
				List<AppointmentDto> appointmentDtos = accService.confirmAppointInfo(appointment);
				model.addAttribute("appointmentDtos", appointmentDtos);
				return "front/canceledappoint.jsp";
			}else if(userService.checkISStudent(user.getUuid())){
				appointment.setStuuuid(user.getUuid());
				List<AppointmentDto> appointmentDtos = accService.confirmstuAppointInfo(appointment);
				model.addAttribute("appointmentDtos", appointmentDtos);
				return "front/stucanceledappoint.jsp";
			}
			
		} catch (Exception e) {
			Log.logger.error("查询预约已取消记录失败");
			e.printStackTrace();
		}
		return "front/canceledappoint.jsp";
	}
	@RequestMapping("user/successful")
	public String successfulappoint(Model model,HttpSession httpsession) {
		Object obj = httpsession.getAttribute("user");
		User user;
		if (obj != null) {
			user = (User)obj ;
		}else {
			return "front/gologin.jsp";
		}
		Appointment appointment = new Appointment();
		appointment.setState(AppointmentState.SUCCESSFUL_APPOINTMENT);
		try {
			if(userService.checkISTeacher(user.getUuid())) {
				appointment.setTeacuuid(user.getUuid());
				List<AppointmentDto> appointmentDtos = accService.confirmAppointInfo(appointment);
				model.addAttribute("appointmentDtos", appointmentDtos);
				return "front/successfulappoint.jsp";
			}else if(userService.checkISStudent(user.getUuid())){
				appointment.setStuuuid(user.getUuid());
				List<AppointmentDto> appointmentDtos = accService.confirmstuAppointInfo(appointment);
				model.addAttribute("appointmentDtos", appointmentDtos);
				return "front/stusuccessfulappoint.jsp";
			}
		} catch (Exception e) {
			Log.logger.error("查询预约成功记录失败");
			e.printStackTrace();
		}
		return "front/successfulappoint.jsp";
		
	}
	@RequestMapping(value="user/finish",method=RequestMethod.POST)
	public @ResponseBody String finish(@RequestParam(name="appointmentid")String appointmentid) {
		Appointment appointment = new Appointment();
		appointment.setAppointmentid(appointmentid);
		appointment.setState(AppointmentState.REMAIN_TO_BE_EVALUATED);
		try {
			accService.updateAppointment(appointment);
		} catch (Exception e) {
			Log.logger.error("完成预约错误");
			e.printStackTrace();
			return "failed";
		}
		return "success";
	}
	@RequestMapping(value="user/evaluate")
	public String evaluateAppoint(Model model,HttpSession httpsession) {
		Object obj = httpsession.getAttribute("user");
		User user;
		if (obj != null) {
			user = (User)obj ;
		}else {
			return "front/gologin.jsp";
		}
		Appointment appointment = new Appointment();
		
		appointment.setState(AppointmentState.REMAIN_TO_BE_EVALUATED);
		try {
			if(userService.checkISTeacher(user.getUuid())) {
				appointment.setTeacuuid(user.getUuid());
				List<AppointmentDto> appointmentDtos = accService.confirmAppointInfo(appointment);
				model.addAttribute("appointmentDtos", appointmentDtos);
				return "front/evaluateappoint.jsp";
			}else if(userService.checkISStudent(user.getUuid())){
				appointment.setStuuuid(user.getUuid());
				List<AppointmentDto> appointmentDtos = accService.confirmstuAppointInfo(appointment);
				model.addAttribute("appointmentDtos", appointmentDtos);
				return "front/stuevaluateappoint.jsp";
			}
		
		} catch (Exception e) {
			Log.logger.error("查询预约成功记录失败");
			e.printStackTrace();
		}
		return "front/evaluateappoint.jsp";
		
	}
	@RequestMapping(value="user/pingjia",method=RequestMethod.POST)
	public @ResponseBody String evaluate(@RequestParam(name="appointmentid")String appointmentid) {
		Appointment appointment = new Appointment();
		appointment.setAppointmentid(appointmentid);
		appointment.setState(AppointmentState.COMPELETED);
		try {
			accService.updateAppointment(appointment);
		} catch (Exception e) {
			Log.logger.error("评价预约错误");
			e.printStackTrace();
			return "failed";
		}
		return "success";
	}
	@RequestMapping(value="user/finished")
	public String finishedAppoint(Model model,HttpSession httpsession) {
		Object obj = httpsession.getAttribute("user");
		User user;
		if (obj != null) {
			user = (User)obj ;
		}else {
			return "front/gologin.jsp";
		}
		Appointment appointment = new Appointment();
		
		appointment.setState(AppointmentState.COMPELETED);
		try {
			if(userService.checkISTeacher(user.getUuid())) {
				appointment.setTeacuuid(user.getUuid());
				List<AppointmentDto> appointmentDtos = accService.confirmAppointInfo(appointment);
				model.addAttribute("appointmentDtos", appointmentDtos);
				return "front/finishedappoint.jsp";
			}else if(userService.checkISStudent(user.getUuid())){
				appointment.setStuuuid(user.getUuid());
				List<AppointmentDto> appointmentDtos = accService.confirmstuAppointInfo(appointment);
				model.addAttribute("appointmentDtos", appointmentDtos);
				return "front/stufinishedappoint.jsp";
			}
			
		} catch (Exception e) {
			Log.logger.error("查询预约成功记录失败");
			e.printStackTrace();
		}
		return "front/finishedappoint.jsp";
		
	}
	@RequestMapping(value="user/updateuser",method=RequestMethod.POST)
	public @ResponseBody User updateUserInfo(User user,HttpSession httpsession,
			@RequestParam(value = "headfile", required = false)MultipartFile headimg) {
		try {
			if(headimg!=null && !headimg.isEmpty()) {
				String newimgname =  UUIDutil.getId()+".jpg";
				File newfile = new File(path + newimgname);  
				headimg.transferTo(newfile);
				user.setHeadimg("http://localhost:8080/img/"+newimgname);
			}
			user = accService.updateUserInfo(user);
			httpsession.setAttribute("user", user);
		} catch (Exception e) {
			Log.logger.error("用户"+user.getUsername()+"修改用户信息错误");
			e.printStackTrace();
		}
		return user;
	}
	
	

}
