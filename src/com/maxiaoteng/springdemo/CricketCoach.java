package com.maxiaoteng.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneservice;
	
	private String emailAddress;
	private String teamName;
	
	public CricketCoach() {
		
	}
	
	
	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeamName() {
		return this.teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	// Use a set method for dependency injection
	public void setFortuneService(FortuneService fortuneservice) {
		
		this.fortuneservice = fortuneservice;
	}


	@Override
	public String getDailyWorkout() {

		return "I'm a cricket coach, and Come On for 40 minutes in Swimming!";
	}

	@Override
	public String getDailyFortune() {

		return "I'm Cricket Coach," + fortuneservice.getFortune() + "and a sunny day";
	}

}
