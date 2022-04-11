package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext classPathXmlApplicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = classPathXmlApplicationContext.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = classPathXmlApplicationContext.getBean("tennisCoach", Coach.class);
		
		boolean result =(theCoach==alphaCoach);
		
		System.out.println("\nPointing to the same object:" +result);
		
		System.out.println("\nPointing to the the coach: " +theCoach);
		
		System.out.println("\nPointing to the alphaCoach: " +alphaCoach);
		
		classPathXmlApplicationContext.close();
		
	}

}
