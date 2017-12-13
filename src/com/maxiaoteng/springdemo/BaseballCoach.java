package com.maxiaoteng.springdemo;

public class BaseballCoach implements Coach {
	
	// Create a private variable
	private FortuneService fortuneService;
	
	// Create a constructor for Dependency Injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Maxiaoteng needs to Spend 30 minutes on batting practice.";
	}

	@Override
	public String getDailyFortune() {
		// Use the dependency injection 
		return fortuneService.getFortune();
	}
	
	

}
