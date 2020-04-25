package com.elagin.dmitry.components;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("hockeyPlayer")
public class HockeyPlayer implements Sportsman {

	//Автосвязывание через приватное поле
	@Autowired
	//Уточнение бина
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;


	public HockeyPlayer() {
		System.out.println("HockeyPlayer default constructor...");
	}

	//Автоматическое связывание компонентов через конструктор
	@Autowired
	public HockeyPlayer(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("HockeyPlayer constructor...");
	}


	//Автосвязывание через сеттер
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		
		return "Двухсторонняя тренировка на льду";
	}
	
	public String getDaylyFortune() {
		return fortuneService.getDailyFortune();
	}



}
