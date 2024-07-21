package com.myproj.ConfigJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myproj.DTOs.LoginRegisterDTO;
import com.myproj.DTOs.ProductCategoryDTO;

public class Javamainclass {

	public static void main(String[] args) {

		LoginRegisterDTO beanServices1 = (LoginRegisterDTO) ServiceLocator.getJAVAConfigBean("logindto");
		beanServices1.show();
		/*
		 * ApplicationContext context=new
		 * AnnotationConfigApplicationContext(testconfig.class); LoginRegisterDTO
		 * beanServices = (LoginRegisterDTO) context.getBean("getdto");
		 */
//			  ApplicationContext context=new
//			  AnnotationConfigApplicationContext(springMVCJavaConfig.class);
//			  LoginRegisterDTO dto=(LoginRegisterDTO)context.getBean("LoginRegisterDTO");
//			  dto.show();

	}

}
