/*
 * IoC example
 *
 *  The example demonstrates inversion of Control.
 *  IoC container is represented by the interface ApplicationContext.
 *  The Spring container is responsible for instantiating, configuring 
 *  and assembling objects our bean City .
 *  
 *  The example uses constructor-based dependency injection, 
 *  the container will invoke the constructor and will pass
 *  the string "Vidin" for the name of the City.
 *  Also the example ilustrates setter based injection
 *  
 *  Also both are possible to be combined:constructor normally is for 
 *  mandatory fields,setter with optional.Here just for the example I put  
 *  both and it's printed the last one - this one of setter injection
 */

package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCAppChallenge2 {
	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-challenge.xml");

		// create the bean
		City city = (City) ctx.getBean("city");

		// invoke the company slogan via the bean
		city.cityName();

		// Print Organization details
		System.out.println(city);

		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
