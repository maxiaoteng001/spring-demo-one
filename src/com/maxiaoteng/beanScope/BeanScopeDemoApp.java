package com.maxiaoteng.beanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maxiaoteng.springdemo.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// Load the Spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// Retrieve the beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// Check if they are the same beans
		boolean result = (theCoach == alphaCoach);
		
		// Print out the results
		
		System.out.println("Pointing to the same object "+ result);
		
		System.out.println("Memory location for theCoach: "+ theCoach);
		
		System.out.println("Memory location for alphaCoach: "+ alphaCoach);
		
		
		// Close the context
		context.close();
	}

}
