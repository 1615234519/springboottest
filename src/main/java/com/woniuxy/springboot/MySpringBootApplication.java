package com.woniuxy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource("classpath:mine.xml")
@SpringBootApplication
public class MySpringBootApplication {

	public static void main(String[] args) {
		System.out.println("aaa");
		SpringApplication.run(MySpringBootApplication.class, args);
	}

}
