package com.ishant.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	/*Constructor Injection
	 @Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
*/
	public TennisCoach(){
		System.out.println("Inside Default Constructor");
	}
	private FortuneService fortuneService;
	
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}
	
	@Autowired
	public void doSoneStuff(FortuneService fortuneService) {
		System.out.println("Inside DdoSomeStuff()");
		this.fortuneService = fortuneService;
	}
}
