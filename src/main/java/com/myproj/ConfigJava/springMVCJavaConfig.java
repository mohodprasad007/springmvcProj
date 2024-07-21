package com.myproj.ConfigJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.myproj.DTOs.LoginRegisterDTO;
import com.myproj.DTOs.ProductCategoryDTO;

@EnableWebMvc
@ComponentScan(basePackages = "com.myproj")
@Configuration
public class springMVCJavaConfig implements WebMvcConfigurer{

	/*
	 * @Bean public LoginRegisterDTO getdto() { LoginRegisterDTO dto=new
	 * LoginRegisterDTO(); dto.setFname("ram"); return dto;}
	 */
	 

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
		  registry
          .addResourceHandler("/resources/**").addResourceLocations("/static/");
//this   for static  resoure access when  url contain  resources/
	}
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
	    registry.addViewController("/").setViewName("index");
	    //This is used when we are not handling the request using @Controller handler method ,
        //rather want’s to map a URL directly to view template.
	}

	/*
	 * @Override public void addInterceptors(InterceptorRegistry registry) {
	 * //interceptor config registry.addInterceptor( new LogInterceptor() ); }
	 */
	/*
	 * public static void main(String[] args) { String
	 * path="applicationContext.xml";
	 * 
	 * ProductCategoryDTO main1 = (ProductCategoryDTO)
	 * ServiceLocator.getBeanServices("proddto"); System.out.println( );
	 * main1.showDtls();
	 * 
	 * 
	 * 
	 * }
	 */
}
