package com.elagin.dmitry.beans;

import com.elagin.dmitry.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);

        BoxingCoach boxingCoach=context.getBean(BoxingCoach.class);

        System.out.println(boxingCoach.getFirstName());
        System.out.println(boxingCoach.getLastName());
        System.out.println(boxingCoach.getDailyWorkout());
        System.out.println(boxingCoach.getDailyFortune());
}
}
