package com.maxiaoteng.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach myCoach = context.getBean("maxiaoteng'sCoach", Coach.class);
	
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(myCoach.getDailyFortune());
	
		// close the context
		context.close();
	}

}
