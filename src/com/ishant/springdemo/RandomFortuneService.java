package com.ishant.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] data={"Good Day","Good Luck","You will rock today"};
	private Random random=new Random();
	
	
	public String getFortuneService() {
		// pick a random string from the array
		int index=random.nextInt(data.length);		
		return data[index];
	}

}
