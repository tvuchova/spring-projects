package com.example.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springdemo.config.AppConfig;
import com.example.springdemo.domain.CricketCoach;

public class SetterDemoApp {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext context= 
		//		new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
	
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailAdress());
		System.out.println(theCoach.getTeam());
 
	}

}
