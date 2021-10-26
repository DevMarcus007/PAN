package com.marcus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class App4Application {

	public static void main(String[] args) {
		SpringApplication.run(App4Application.class, args);
	}

}
