package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a cons for dependency injection
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mintutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		//use my fortune service to get a fortune
		return fortuneService.getFortune();
	}
}
