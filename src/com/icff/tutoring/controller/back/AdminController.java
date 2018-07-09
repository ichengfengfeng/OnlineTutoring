package com.icff.tutoring.controller.back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.icff.tutoring.po.User;
import com.icff.tutoring.service.IuserService;
import com.icff.tutoring.util.Log;

@Controller
@RequestMapping("admin")
@SessionAttributes("admin")
public class AdminController {
	@Autowired
	IuserService userService;
	
	@RequestMapping(value="login",method = RequestMethod.GET)
	public String login() {
		return "back/login.jsp";
	}
	@RequestMapping(value="login",method = RequestMethod.POST)
	public String login(String username,String password,ModelMap modelMap) {
		Log.logger.info("--用户登录");
    	if(username != null && password != null && 
    			!"".equals(username) && !"".equals(password)) {
    		try {
				final User admin = userService.getUserByUnameAndPass(username, password);
				if(admin != null && userService.checkISadmin(admin.getUuid())) {
					//将用户信息保存到session中
					modelMap.addAttribute("admin", admin);
					return "back/tutortypeManager.jsp";
				}else {
					modelMap.addAttribute("username", username);
					modelMap.addAttribute("errmsg", "密码不正确，请重新登录");
				}
			} catch (Exception e) {
				Log.logger.error("网络异常");
				e.printStackTrace();
				modelMap.addAttribute("errmsg", "网络异常");
				return "front/error.jsp";
			}
    	}
    	return "back/login.jsp";
		
	}

}
