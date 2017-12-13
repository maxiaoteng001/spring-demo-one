package com.maxiaoteng.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	private static ClassPathXmlApplicationContext myContext;

	public SetterDemoApp() {
	}

	public static void main(String[] args) {
		// Load the Spring configuration file
		myContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve bean from spring container
		CricketCoach cricketCoach = myContext.getBean("myCricketCoach", CricketCoach.class);
		
		// Call methods on those beans 
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println("The Coach's eamilAddress: " + cricketCoach.getEmailAddress());
		System.out.println("The Coach's teamName: "+ cricketCoach.getTeamName());
	
		// Close the context
		myContext.close();
	}

}
