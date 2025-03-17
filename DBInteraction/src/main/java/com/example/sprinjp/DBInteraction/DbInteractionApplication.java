package com.example.sprinjp.DBInteraction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DbInteractionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbInteractionApplication.class, args);
	}

	
	@Bean
	 public RestTemplate restTemplate() {
        return new RestTemplate();
    }
	
}
