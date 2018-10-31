package com.example.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.example.springdemo.domain.Coach;
import com.example.springdemo.domain.CricketCoach;
import com.example.springdemo.domain.TrackCoach;
import com.example.springdemo.services.HappyFortuneService;
import com.example.springdemo.services.RealFortuneService;

@Configuration
@PropertySource("classpath:sport.properties")
public class AppConfig {
	@Bean
	public HappyFortuneService myFortuneService() {
		return new HappyFortuneService();
	}

	@Bean
	public RealFortuneService myRandomService() {
		return new RealFortuneService();
	}

	@Bean
	public Coach myCoach() {
		return new TrackCoach(myFortuneService());
	}

	@Bean
	public Coach myCricketCoach() {
		CricketCoach criket = new CricketCoach();
		criket.setFortuneService(myRandomService());

		return criket;
	}

	@Bean(initMethod = "doMyStartupStuff", destroyMethod = "doMyCleanupStuff")
	public Coach myTruckCoach() {
		TrackCoach truck = new TrackCoach(myFortuneService());

		return truck;
	}

	@Bean
	@Scope("prototype")
	public Coach myPrototypeCoach() {
		TrackCoach truck = new TrackCoach(myFortuneService());

		return truck;
	}

}
