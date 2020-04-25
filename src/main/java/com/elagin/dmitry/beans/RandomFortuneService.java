/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elagin.dmitry.beans;

import java.util.List;
import java.util.Random;

/**
 *
 * @author Dmitry
 */
public class RandomFortuneService implements FortuneService{

   private List<String> fortunes;

    public void setFortunes(List<String> fortunes) {
        this.fortunes = fortunes;
    }

    @Override
    public String getDailyFortune() {

       Random random=new Random(System.currentTimeMillis());
       return fortunes.get(random.nextInt(fortunes.size()));
    }
    
}
