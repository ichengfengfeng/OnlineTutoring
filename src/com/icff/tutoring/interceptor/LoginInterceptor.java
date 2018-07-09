package com.icff.tutoring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.icff.tutoring.po.User;
import com.icff.tutoring.util.Log;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Log.logger.info(this.getClass().getName()+"执行ing");
		HttpSession httpsession = request.getSession();
		User user  = (User) httpsession.getAttribute("user");
		User admin  = (User) httpsession.getAttribute("admin");
	    if(user== null && admin==null) {
	    	System.out.println(request.getRequestURI());
	    	 response.sendRedirect("../login");
	    	 return false;
	    }
	   
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
