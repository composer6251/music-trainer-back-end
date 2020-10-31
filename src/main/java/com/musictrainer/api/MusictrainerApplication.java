package com.musictrainer.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients(basePackages = {"com.musictrainer.api.client"})
public class MusictrainerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusictrainerApplication.class, args);
	}

}
