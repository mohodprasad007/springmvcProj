package com.myproj.ConfigJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myproj.DTOs.LoginRegisterDTO;
import com.myproj.DTOs.ProductCategoryDTO;
@ComponentScan
@Configuration
public class ServiceLocator {

	
/*	  public static void main(String[] args) { // here we used java based
	
	  
	  ApplicationContext context=new
	  AnnotationConfigApplicationContext(springMVCJavaConfig.class);
	  LoginRegisterDTO dto=(LoginRegisterDTO)context.getBean("LoginRegisterDTO");
	  dto.show(); */
	/*  String path="applicationContext.xml"; ApplicationContext context=new
	  ClassPathXmlApplicationContext(path); ProductCategoryDTO
	  dto=(ProductCategoryDTO) context.getBean("proddto");
	  System.out.println("bean created is="+dto);*/
	  
	  
	  
	  
	  public static Object getJAVAConfigBean(String ss) {
		  ApplicationContext context=new
				  AnnotationConfigApplicationContext(testconfig.class);
		  Object ob = context.getBean(ss);
		  return ob;
		  
		  
	  }
	  
	 
		
		  public static Object getXMLBean(String ss) {
			
				  String path = "applicationContext.xml";
				  ApplicationContext context = new ClassPathXmlApplicationContext(path);
		  Object ob = context.getBean(ss);
		  return ob;
		  
		  }
		 

}
