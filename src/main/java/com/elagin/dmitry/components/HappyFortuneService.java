package com.elagin.dmitry.components;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "Сегодня счастливый день!";
    }
}
