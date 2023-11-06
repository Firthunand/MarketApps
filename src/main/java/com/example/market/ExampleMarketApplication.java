package com.example.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.market.persistence.crud")
public class ExampleMarketApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExampleMarketApplication.class, args);
	}

}
