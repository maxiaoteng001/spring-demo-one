package com.maxiaoteng.beanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maxiaoteng.springdemo.Coach;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// Load the Spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// Retrieve the beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
				
		System.out.println(theCoach.getDailyWorkout());
		
		// Close the context
		context.close();
	}

}
