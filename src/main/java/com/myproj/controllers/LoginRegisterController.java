package com.myproj.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.myproj.ConfigJava.ServiceLocator;
import com.myproj.DAO.LoginRegisterDAO;
import com.myproj.DTOs.LoginRegisterDTO;
import com.myproj.service.LoginRegisterService;

@Controller
public class LoginRegisterController {


	@Autowired
	 private   LoginRegisterService service ;
		/*
		 * @Autowired LoginRegisterDTO dto = null;
		 */
	
		/*
		 * @Qualifier("LoginRegisterService") public void
		 * setClientService(LoginRegisterService clientService) { this.service =
		 * clientService; }
		 */
	   
		
	//@PostMapping(value ="LoginServlet")
	@RequestMapping(value ="/LoginServlet" , method = RequestMethod.POST)
	public ModelAndView  login(@RequestParam("username") String username,@RequestParam("password") String password) {
		ModelAndView modal=new ModelAndView ();
	
		LoginRegisterDTO dto = new LoginRegisterDTO();   
		//LoginRegisterDTO dto = (LoginRegisterDTO) ServiceLocator.getXMLBean("logindto");
		//LoginRegisterService service = (LoginRegisterService) ServiceLocator.getXMLBean("LoginRegisterService");
		LoginRegisterDTO dto1 =null;
		//dto1.getUsername();
dto.setUsername(username);
dto.setPassword(password);
LoginRegisterDTO login = null;
		try {
			
	
			login = service.login(dto);
		} catch (Exception e) {
			e.printStackTrace();
			
		     modal.setViewName("error");

			return modal;
		}
		if(login !=null&& login.isFlag()) {
		modal.addObject("username", username);
			modal.setViewName("index2");

		}else if(login !=null && login.isFlag() && login.getRole().equals("2")) {
			
		modal.addObject("username", username);
		modal.addObject("role", "admin");
			modal.setViewName("index2");
			System.out.println("admin login");

		}
		
		else {modal.addObject("msg", "Invalid username or password!");
	     modal.setViewName("login2");}

		return modal;
	
	}
	
	
	
	
	//@PostMapping(value="addUser")
	@RequestMapping(value ="/addUser" , method = RequestMethod.POST)
	public  ModelAndView adduser(@ModelAttribute LoginRegisterDTO dto, Model  modal1)
	{
		ModelAndView modal=new ModelAndView ();
		
	if(dto!=null) {
		try {
			//check is user already  register or not
			 LoginRegisterDTO existcheck =service.CheckExistingUser(dto);
			 if(existcheck==null ) {
				 
			 
			boolean flag=service.adduser(dto);
			if(flag) {
				modal.addObject("username", dto.getEmail());
				modal.setViewName("index2");
			} else {
				
				modal.addObject("msg", "Something Went Wrong, Please Try Again!");
			     modal.setViewName("login2");	
			}
			 }else {
					
					modal.addObject("msg", "Email already register with  us  please login!");
				     modal.setViewName("login2"); 
			 }
			
		} catch (Exception e) {
			  modal.setViewName("error");
e.printStackTrace();
				return modal;
		
		}	
	}
	else {
		 modal.setViewName("error");
	}
	return modal;
	}		

	

}
