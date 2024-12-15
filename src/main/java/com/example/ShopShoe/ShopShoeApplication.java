package com.example.ShopShoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
// (exclude =
// org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class ShopShoeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopShoeApplication.class, args);
	}

}
