package com.example.springdemo.domain;

import com.example.springdemo.services.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {

	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "TrackCoach Do It: " + fortuneService.getFortune();
	}

	public void doMyStartupStuff() {
		System.out.printf("TrackCoach in doMyStartupStuff");

	}

	public void doMyCleanupStuff() {
		System.out.printf("TrackCoach in doMyCleanupStuff");

	}

}
