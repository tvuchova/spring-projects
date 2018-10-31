package com.example.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.springdemo.config.AppConfig;
import com.example.springdemo.domain.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

	}

}
