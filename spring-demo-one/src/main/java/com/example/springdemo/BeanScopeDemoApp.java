package com.example.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springdemo.config.AppConfig;
import com.example.springdemo.domain.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		boolean result = (theCoach == alphaCoach);

		System.out.println("Pointing to the same objext" + result);
		System.out.println("Memory location for the coach" + theCoach);
		System.out.println("Memory location for the alphscoach" + alphaCoach);

	}

}
