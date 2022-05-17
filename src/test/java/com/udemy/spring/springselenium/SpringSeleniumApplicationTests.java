package com.udemy.spring.springselenium;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSeleniumApplicationTests {
    @Autowired
	private User user;
    @Autowired
	private Faker faker;
	@Test
	void contextLoads() {
		//Faker faker =new Faker();
		this.user.printDetails();

	}


}

//user.printDetails();                                          //When printing the details.
//System.out.println(this.path);                               // Accessing the part
//System.out.println(this.fruits);                                //Accessing the properties in application.properties file.
//this.user.printDetails();

//__________________________________________________________________________________________________________________________

/*
Address address=new Address();
Salary salary=new Salary();
User user=new User(address,salary);
user.printDetails();
*/

//___________________________________________________________________________________________________________________________

/*
//When accessing the path is not running
	@Value("PATH")
	private String path;

//if you want to access property that is in application.properties file.
	@Value("${fruits}")
	private String fruits;

 */