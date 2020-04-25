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
public class HockeyCoach implements Coach {

    private String email;
    private String team;

    public HockeyCoach() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        System.out.println("HockeyCoach setEmail...");
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
        System.out.println("HockeyCoach setTeam...");
    }

    @Override
    public String getDailyWorkout() {
        return "Отработка игры в меньшинстве";
    }

    @Override
    public String getDailyFortune() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
