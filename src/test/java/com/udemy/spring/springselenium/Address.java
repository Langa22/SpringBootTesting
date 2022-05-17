package com.udemy.spring.springselenium;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    //Getting the amount from the property file.
    @Value("${street}")
    private String street;

    /*public Address(){
        this.street="32 Hill Street,Randburg, 2194";
    }*/

    public String getStreet() {
        return street;
    }
}
