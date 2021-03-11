package com.vishal.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProductserviceApplication {

	@Bean
	public RestTemplate restTemplate() // at run time we will have rest template bean
	{
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(ProductserviceApplication.class, args);
	}

}
