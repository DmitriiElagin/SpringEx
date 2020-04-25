package com.elagin.dmitry;

import com.elagin.dmitry.beans.BoxingCoach;
import com.elagin.dmitry.beans.FortuneService;
import com.elagin.dmitry.beans.RandomFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.elagin.dmitry.beans")
public class Config {


   @Bean
    public List<String> getFortunes(){
        ArrayList<String> fortunes=new ArrayList<>();

        fortunes.add("Сегодня удачный день");
        fortunes.add("Сегодня обычный день");
        fortunes.add("Сегодня неудачный день");
        return fortunes;
    }
    @Bean
    public FortuneService getFortuneService() {
        RandomFortuneService fortuneService=new RandomFortuneService();
        fortuneService.setFortunes(getFortunes());
        return fortuneService;
    }

    @Bean
    public BoxingCoach getBoxingCoach(){
       BoxingCoach coach=new BoxingCoach();

       coach.setFortune(getFortuneService());
       coach.setFirstName("Растям");
       coach.setLastName("Батериков");

       return coach;
    }
}
