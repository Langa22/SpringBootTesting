package com.udemy.spring.springselenium;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {
    //Getting the amount from the property file.
    @Value("${amount:500}")
    private int amount;


    /*public Salary(){
        this.amount=100;
    }*/
    public int getAmount(){
        return amount;
    }
}
