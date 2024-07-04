package com.iith.Reditt.clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class RedittCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedittCloneApplication.class, args);
	}

}
