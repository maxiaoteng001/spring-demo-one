package com.maxiaoteng.springdemo;

public class TrackCoach implements Coach {

	//Create private field for dependency injection
	private FortuneService fortuneService;
	
	//Create the constructor for private field
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5K.";
	}



	@Override
	public String getDailyFortune() {

		return "Just Do It! I'm a TrackCoach!"+fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}

	// add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}
	
	
}








