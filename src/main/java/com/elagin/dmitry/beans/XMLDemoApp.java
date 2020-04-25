/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elagin.dmitry.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Dmitry
 */
public class XMLDemoApp {
    
    public static void main(String[] args) {
        //Создание контекста Spring из xml-файла
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //Coach coach=context.getBean("myCoach",Coach.class);
        HockeyCoach coach=context.getBean("myCoach",HockeyCoach.class);
        BoxingCoach boxingCoach=context.getBean(BoxingCoach.class);
        PowerliftingCoach powerliftingCoach=context.getBean(PowerliftingCoach.class);
                
        //System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getTeam());
        System.out.println(coach.getEmail());
        System.out.println();


        System.out.println(boxingCoach.getFirstName());
        System.out.println(boxingCoach.getLastName());
        System.out.println(boxingCoach.getDailyWorkout());
        System.out.println(boxingCoach.getDailyFortune());


        //Закрыть контекст Spring
        context.close();
        
               
    }
    
}
