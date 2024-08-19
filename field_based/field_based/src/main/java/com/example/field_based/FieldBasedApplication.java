package com.example.field_based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.field_based")
public class FieldBasedApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(FieldBasedApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Car car = context.getBean(Car.class);
		car.drive();
	}
}

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class FieldBasedApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(FieldBasedApplication.class, args);
//	}
//
//}
