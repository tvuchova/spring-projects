package com.example.springdemo;

import com.example.springdemo.domain.Coach;
import com.example.springdemo.domain.TrackCoach;

public class MyApp {

	public static void main(String[] args) {

		// create the object
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());		
	}

}
