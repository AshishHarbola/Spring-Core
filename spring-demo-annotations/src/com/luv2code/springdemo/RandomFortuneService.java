package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] data= {
			"Beware of the wolf in the sheep's clothing",
			"Deligence is the mother of good luck",
			"The journey is the reward"
	};
	
	// create a random number generator
	private Random myRandom = new Random();
	
	
	
	@Override
	public String getFortune() {
		//pick a random fortune from that array
		int index =  myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
