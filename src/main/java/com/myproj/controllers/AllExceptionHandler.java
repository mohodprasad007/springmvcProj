package com.myproj.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice
public class AllExceptionHandler {
	
	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	 @ExceptionHandler(value =Exception.class)
	    public String numberformatHandler(Model theModel) {   
		 // any Exception  in this  controller handle by it
	        theModel.addAttribute("err", "this");
	        return "error";
	    }

}
