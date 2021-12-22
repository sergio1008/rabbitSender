package com.serbernal.rabbittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class RabbitTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitTestApplication.class, args);
	}
 

}
