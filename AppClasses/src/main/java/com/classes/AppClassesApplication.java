package com.classes;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.classes.tabelas.Produtos;

@SpringBootApplication
public class AppClassesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppClassesApplication.class, args);
		
		Produtos produto1 = new Produtos();
		produto1.setDescription("Luva");
		produto1.setValue(20.5);
		
		System.out.println(produto1);
		System.out.println(produto1.getDescription());
		System.out.println(produto1.getValue());
		
	}

}
