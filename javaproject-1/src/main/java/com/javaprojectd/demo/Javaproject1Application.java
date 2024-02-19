package com.javaprojectd.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import model.Coder;

@SpringBootApplication
public class Javaproject1Application {

	public static void main(String[] args) {
		
		ApplicationContext  context = SpringApplication.run(Javaproject1Application.class, args);
		
		Coder c1 = (Coder)context.getBean("");
	}

}
