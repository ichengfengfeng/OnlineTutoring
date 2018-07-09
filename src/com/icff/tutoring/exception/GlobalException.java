package com.icff.tutoring.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class GlobalException implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		ModelAndView mv =  new ModelAndView();
		mv.addObject("errmsg", ex.getMessage());
		mv.addObject("statu", response.getStatus());
		mv.setViewName("front/error.jsp");
		return mv;
	}
	
	

}
