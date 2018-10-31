package com.example.springdemo.domain;

import com.example.springdemo.services.FortuneService;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	public BaseballCoach() {
	}

	public BaseballCoach(FortuneService fortuneService) {
		// super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}

}
