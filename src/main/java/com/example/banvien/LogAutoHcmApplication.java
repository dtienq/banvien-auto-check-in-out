package com.example.banvien;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class LogAutoHcmApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogAutoHcmApplication.class, args);
	}

}
