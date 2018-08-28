package com.ishant.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public String getFortuneService() {
		return "Today is your Lucky Day!!!";
	}

}
