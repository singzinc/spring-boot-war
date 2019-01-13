package com.singplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
//import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//@EnableZuulProxy
@SpringBootApplication
public class Application extends SpringBootServletInitializer{
// insert the comment
	 @Override
	 protected SpringApplicationBuilder configure( SpringApplicationBuilder application) {
	        return application.sources(Application.class);
	 }
	 
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
}
