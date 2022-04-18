package com.ecommerce.marketplaceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiMarketplaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiMarketplaceApplication.class, args);
	}

}
