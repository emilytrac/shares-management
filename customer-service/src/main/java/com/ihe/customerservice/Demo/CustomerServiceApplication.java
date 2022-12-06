package com.ihe.customerservice.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication (scanBasePackages = "come.ihe.customerservice")
@EntityScan(basePackages = "com.ihe.customerservice.entity")
@EnableJpaRepositories(basePackages = "com.ihe.customerservice.persistence")
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

}
