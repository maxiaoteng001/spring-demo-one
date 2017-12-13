package com.maxiaoteng.springdemo;

public class MyApp {

	public static void main(String[] args) {

		//create the object
		Coach theCoach = new TrackCoach(null);
		
		//use the object
		System.out.print(theCoach.getDailyWorkout());

	}

}
