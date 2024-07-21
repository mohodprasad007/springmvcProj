package com.myproj.ConfigJava;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = { "com.myproj.DTOs","com.myproj.DAO","com.myproj.service","com.myproj.ServiceImpl","com.myproj.controllers","com.myproj.DaoImpl"})
@Configuration
public class testconfig {
	

}
