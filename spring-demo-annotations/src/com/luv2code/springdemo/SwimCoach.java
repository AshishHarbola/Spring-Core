package com.luv2code.springdemo;

import javax.xml.ws.soap.Addressing;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 100 mts as a warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}


}
