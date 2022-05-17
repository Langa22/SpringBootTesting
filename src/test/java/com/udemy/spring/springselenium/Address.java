package com.udemy.spring.springselenium;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

@Autowired
private Faker faker;

    public String getStreet() {
        return this.faker.address().streetAddress();
    }
}
/*
 //Getting the amount from the property file.
    @Value("${street}")
    private String street;

    /*public Address(){
        this.street="32 Hill Street,Randburg, 2194";
    }
 */