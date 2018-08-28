package com.ishant.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
	//read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
	//get the bean from cotaoiner
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
	//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
	//close the context
		context.close();
	}

}

/*WARNING: Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'tennisCoach': Unsatisfied dependency expressed through field 'fortuneService'; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.ishant.springdemo.FortuneService' available: expected single matching bean but found 4: databaseFortuneService,happyFortuneService,randomService,restFortuneService
Exception in thread "main" org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'tennisCoach': Unsatisfied dependency expressed through field 'fortuneService'; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.ishant.springdemo.FortuneService' available: expected single matching bean but found 4: databaseFortuneService,happyFortuneService,randomService,restFortuneService*/