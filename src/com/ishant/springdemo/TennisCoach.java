package com.ishant.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	/*Constructor Injection
	 @Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
*/
	public TennisCoach(){
		System.out.println("Inside Default Constructor");
	}
	
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
	//define my init method
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println("Inside doMyStartupStuff()");
	}
	
	//define my destroy menthod
	@PreDestroy
	public void doMyCleanupStuff(){
		System.out.println("Inside doMyCleanupStuff()");
	}
	/*@Autowired
	public void doSoneStuff(FortuneService fortuneService) {
		System.out.println("Inside DdoSomeStuff()");
		this.fortuneService = fortuneService;
	}*/
}
