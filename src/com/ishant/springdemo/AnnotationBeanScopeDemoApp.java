package com.ishant.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load Spring configartion file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		//retrive bean form container
		Coach theCoach =context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach =context.getBean("tennisCoach",Coach.class);
		boolean result =(theCoach == alphaCoach);
		System.out.println("pointing to same object : "+ result);
		System.out.println("mem loc of theCoach: "+ theCoach);
		System.out.println("mem loc of aliphaCoach: "+ alphaCoach);

	}

}
