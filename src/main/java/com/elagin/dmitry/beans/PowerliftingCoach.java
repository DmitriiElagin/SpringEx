/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elagin.dmitry.beans;

/**
 *
 * @author Dmitry
 */
public class PowerliftingCoach implements Coach{

    private void init(){
        System.out.println("PowerliftingCoach init method");
    }

    @Override
    public String getDailyWorkout() {
        return "Силовая тренировка мышц спины";
    }

    @Override
    public String getDailyFortune() {
       return "Лифтерам удача не нужна";
    }

    private void destroy(){
        System.out.println("PowerliftingCoach destroy method");
    }


}
