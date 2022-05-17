package com.udemy.spring.springselenium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    //If we don't have constructor and set methods we can use field injection.
    @Autowired
    private Address address;
    @Autowired
    private Salary salary;

    //If you don't have the constructor you can use @Autowired on set methods to inject.
    /*@Autowired
    public void setAddress(Address address) {
        this.address = address;
    }
    @Autowired
    public void setSalary(Salary salary) {
        this.salary = salary;
    }*/

    //Spring will do the constructor injection if there is a constructor
    /* public User(Address address, Salary salary) {
            this.address = address;
            this.salary = salary;
        }*/
    public void printDetails(){
        System.out.println("Address : "+this.address.getStreet());
        System.out.println("Salary : "+this.salary.getAmount());
    }
}
