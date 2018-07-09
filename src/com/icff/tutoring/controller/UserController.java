package com.icff.tutoring.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.icff.tutoring.po.User;
import com.icff.tutoring.service.IuserService;
import com.icff.tutoring.util.Log;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

/**
 * 
 * @author iCff
 *
 */
@Controller
@SessionAttributes("user")
public class UserController {
	@Autowired
	private IuserService userService;
	
    @RequestMapping(value = {"/login"},method = {RequestMethod.GET})
	public String login(){
		return "front/login.jsp";
	}
    /**
     * 用户登录
     * @param model
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(ModelMap modelMap,String username,String password) {
    	Log.logger.info("--用户登录");
    	if(username != null && password != null && 
    			!"".equals(username) && !"".equals(password)) {
    		try {
				final User user = userService.getUserByUnameAndPass(username, password);
				if(user != null) {
					//将用户信息保存到session中
					modelMap.addAttribute("user", user);
				}else {
					modelMap.addAttribute("username", username);
					modelMap.addAttribute("errmsg", "密码不正确，请重新登录");
					return "front/login.jsp";
				}
			} catch (Exception e) {
				Log.logger.error("网络异常");
				e.printStackTrace();
				modelMap.addAttribute("errmsg", "网络异常");
				return "front/error.jsp";
			}
    	}
    	return "front/main.jsp";
    }
    @RequestMapping(value = "main",method = RequestMethod.GET)
    public String main() {
    	return "front/main.jsp";
    }
    @RequestMapping("user/logout")
    public String logout(HttpSession httpsession,SessionStatus sessionStatus) {
    	httpsession.removeAttribute("user");//我这里是先取出httpsession中的user属性
    	httpsession.invalidate();  //然后是让httpsession失效
        sessionStatus.setComplete();//最后是调用sessionStatus方法
    	return "redirect:/main";
    }
    /**
     * 用户注册 
     * @param model
     * @param user
     * @param bindingResult
     * @param role 
     * @return 1 表示注册成功
     */
	@RequestMapping(value = "/register",method = RequestMethod.POST)
    public @ResponseBody String register(Model model,@Validated User user,BindingResult bindingResult,String role) { 
		Log.logger.info("---用户注册");
		String bStr = "2";
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors =  bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
		}
		try {
			final String uuid = userService.register(user, role);
			if(uuid != null && !"".equals(uuid)) {
				bStr = "1";
			}
		}catch (MySQLIntegrityConstraintViolationException ex) {
			Log.logger.error(ex.getMessage());
			model.addAttribute("errmsg", "账号已存在，请重新输入");
		} 
		catch (Exception e) {
			Log.logger.error(e.getMessage());
			e.printStackTrace();
			return "2";
		}
		return bStr;
    }
	@RequestMapping(value = "/register",method = RequestMethod.GET)
	public String register(Model model) {
		return "front/register.jsp";
	}
	/**
	 * 检查账号是否已经存在
	 * @return
	 */
	@RequestMapping(value = "/checkAccount/{username}",method = RequestMethod.GET)
	public @ResponseBody String checkAccount(Model model,
			@PathVariable String username) {
		String bStr = "fail";
		try {
			User user = userService.checkAccount(username);
			if(user == null) {
				bStr = "success";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bStr;
	}
	@RequestMapping("error")
	public String error() {
		return "front/error.jsp";
	}

}
