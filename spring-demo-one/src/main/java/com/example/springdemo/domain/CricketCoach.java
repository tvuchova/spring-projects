package com.example.springdemo.domain;

import org.springframework.beans.factory.annotation.Value;

import com.example.springdemo.services.FortuneService;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
    
	@Value( "${foo.email}")
	private String emailAdress;
	
	@Value("${foo.team}")
	private String team;

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		System.out.println("CricketCoach in setter method -setEmail Adress");
		this.emailAdress = emailAdress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach in setter method -setTeam");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("CricketCoach instantiate with no-arg constructor");
	};

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach in setter method -setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
