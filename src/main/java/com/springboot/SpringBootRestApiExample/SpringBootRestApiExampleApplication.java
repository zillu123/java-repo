package com.springboot.SpringBootRestApiExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.springboot.SpringBootRestApiExample"} )//// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class SpringBootRestApiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiExampleApplication.class, args);
	}

}
