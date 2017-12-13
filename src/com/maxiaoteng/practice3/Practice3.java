package com.maxiaoteng.practice3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maxiaoteng.springdemo.Coach;

/**
 * @author jizhu
 * Bean Scopes with XML Configuration
 * 1. Add bean scopes to your new Coach implementation that you created in one of the previous activities.
 * 2. Test singleton scope and prototype scope as I did in the videos.
 * 3. Verify that the bean scopes are being applied as desired.
 */
public class Practice3 {

	public static void main(String[] args) {
	
		// Load the spring configuration file
		ClassPathXmlApplicationContext myContext = 
				new ClassPathXmlApplicationContext("practice3-applicationContext.xml");
		
		// Get beans from Spring container
		// GolfCoach bean scope set as prototype
		Coach prototypeCoach = myContext.getBean("prototypeCoach", Coach.class);
		Coach secondCoach = myContext.getBean("prototypeCoach", Coach.class);
		
		
		// TrackCoach bean scope set as default, singleton
		Coach defaultCoach = myContext.getBean("defaultCoach", Coach.class);
		Coach singletonCoach = myContext.getBean("defaultCoach", Coach.class);
		
		// Test bean's scope property
		//Test defaultCoach
		boolean result = (prototypeCoach==secondCoach);
		System.out.println("To prototype beans: Is prototypeCoach's memory location are same as secondCoach's\n"+result);
		
		result = (defaultCoach==singletonCoach);
		System.out.println("To default(singleton) beans: Is defaultCoach's memory location are same as singletonCoach's\n"+result);
		
		System.out.println(prototypeCoach);
		System.out.println(secondCoach);
		System.out.println(defaultCoach);
		System.out.println(singletonCoach);
		
		
		// Close context
		myContext.close();
	
	}

}
