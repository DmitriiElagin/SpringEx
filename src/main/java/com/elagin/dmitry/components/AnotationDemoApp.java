package com.elagin.dmitry.components;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnotationDemoApp {

	public static void main(String[] args) {


		//Создать контекст спринга из xml-файла
		//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("annotation_appContext.xml");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("com.elagin.dmitry.components");
		

		HockeyPlayer sportsman=context.getBean("hockeyPlayer",HockeyPlayer.class);
		Sportsman powerlifter=(Sportsman) context.getBean("powerlifter");
		
		System.out.println(sportsman.getDailyWorkout());
		System.out.println(sportsman.getDaylyFortune());
		System.out.println(powerlifter.getDailyWorkout());
		

		context.close();
		

	}

}
