package com.icff.tutoring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.icff.tutoring.util.Log;

@ControllerAdvice
public class ErrorControllerAdvice {
	@ExceptionHandler(Throwable.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)  
    public String processUnauthenticatedException(Model model,HttpServletRequest request, Exception ex) {  
        Log.logger.error(ex.getMessage());
        model.addAttribute("errmsg", ex.getMessage());
        model.addAttribute("statu", HttpStatus.NOT_FOUND);
        return "front/error.jsp"; //返回一个逻辑视图名  
    }  

}
