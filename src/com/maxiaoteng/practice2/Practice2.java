package com.maxiaoteng.practice2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maxiaoteng.springdemo.Coach;

/**
 * @author jizhu
 * Practice Activity #2 - Dependency Injection with XML Configuration

	1. Define a new implementation for the FortuneService.
	
	    a. When the getFortune() method is called it should return a random fortune from the array.
	
	    b. Your fortune service should define three fortunes in an array. 

	2. Inject your new dependency into your Coach implementation.

	3. Test your application to verify you are retrieving random fortunes.
 */
public class Practice2 {

	private static ClassPathXmlApplicationContext myContext;

	public static void main(String[] args) {
		
		myContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean(s) from spring container
		Coach golfCoach = myContext.getBean("golfCoach",Coach.class);
		
		// Call these methods of the bean
		System.out.println(golfCoach.getDailyWorkout());
		System.out.println(golfCoach.getDailyFortune());
		
		// Close the spring context
		myContext.close();

	}

}
