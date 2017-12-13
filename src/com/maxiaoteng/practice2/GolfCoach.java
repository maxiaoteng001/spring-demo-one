package com.maxiaoteng.practice2;

import com.maxiaoteng.springdemo.Coach;

public class GolfCoach implements Coach {

	private RandomFortuneService randomFortune;
	

	public GolfCoach() {
		
	}

	// Use the setter method inject dependency
	public void setRandomFortune(RandomFortuneService randomFortune) {
		this.randomFortune = randomFortune;
	}


	@Override
	public String getDailyWorkout() {
		return "I'm a GolfCoach, and practice Legs Strength Exercise 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		return "I'm a GolfCoach, and " + randomFortune.getFortune();
	}

}
