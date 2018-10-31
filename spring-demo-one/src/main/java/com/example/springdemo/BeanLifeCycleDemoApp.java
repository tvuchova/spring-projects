package com.example.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springdemo.config.AppConfig;
import com.example.springdemo.domain.Coach;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext context = 
			//	new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	    Coach theCoach = context.getBean("myCoach",Coach.class);
	    System.out.println(theCoach.getDailyWorkout());
		     
	}

}
