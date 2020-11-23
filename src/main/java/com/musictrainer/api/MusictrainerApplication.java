package com.musictrainer.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableFeignClients(basePackages = {"com.musictrainer.api.client"})
@EnableJpaRepositories("com.musictrainer.api.users.repo")
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class MusictrainerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusictrainerApplication.class, args);
	}

}
