package com.spring.world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.world.sub1.SpringDemoCompont;

@SpringBootApplication
public class SpringDemoWelComeApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext applicationContext=SpringApplication.run(SpringDemoWelComeApplication.class, args);
	SpringDemoCompont springConfig=applicationContext.getBean(SpringDemoCompont.class);
	String message=springConfig.getWelcomeDetails();
	
		System.out.println("WelCome :: SURS" +message);
	}

}
