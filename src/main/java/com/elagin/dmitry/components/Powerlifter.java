package com.elagin.dmitry.components;

import org.springframework.stereotype.Component;

@Component
public class Powerlifter implements Sportsman {

	@Override
	public String getDailyWorkout() {
		
		return "Силовая тренировка базовыми упражнениями";
	}

}
