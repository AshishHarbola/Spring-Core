package com.luv2code.springdemo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;

@Component
public class TennisCoach implements Coach {

	//using field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	
	public TennisCoach() {
		System.out.println("Inside default constructor");
	}
	
	//define my init method
	@PostConstruct
	public void doMyStarupStuff() {
		System.out.println("Tennis Coach: inside of doMyStartupStuff()");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCLeanupStuff() {
		System.out.println("TennisCoach: inside of doMyCleanupStuff()");
	}
	
	/* constructor injection
	 * @Autowired public TennisCoach(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */
	
	//creating a setter method for injection
	/*@Autowired
	public void setFortuneService(FortuneService thefortuneService) {
		System.out.println("Inside setFortuneMethod() method");
		fortuneService = thefortuneService;
	}*/
	
	//can use any method not necessarily setter
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService thefortuneService) {
//		System.out.println("Inside doSomeCrazyStuff() method");
//		fortuneService = thefortuneService;
//	}
	

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
