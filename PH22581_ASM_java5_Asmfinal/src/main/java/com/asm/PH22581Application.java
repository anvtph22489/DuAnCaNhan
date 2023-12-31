package com.asm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PH22581Application {

	public static void main(String[] args) {
		SpringApplication.run(PH22581Application.class, args);
	}

}
