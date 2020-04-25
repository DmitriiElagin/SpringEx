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
public class BoxingCoach implements Coach{

    
    private String firstName;
    private String lastName;

    private FortuneService fortune;

    public BoxingCoach() {
        System.out.println("Boxing Coach default constructor...");
    }

    public void setFortune(FortuneService fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Отработка защиты и контратаки";
    }
    
    @Override
    public String getDailyFortune() {
        return fortune.getDailyFortune();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
