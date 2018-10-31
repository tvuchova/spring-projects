package com.example.springdemo.services;

import java.util.Random;

public class RealFortuneService implements FortuneService {
	private String[] data = { "Beware of the wolf in sheep's clothing", "Diligence is the mother of good luck",
			"The journey is the reward" };
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];

		return theFortune;
	}

}
