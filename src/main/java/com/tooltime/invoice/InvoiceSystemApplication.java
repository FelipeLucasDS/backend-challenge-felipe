package com.tooltime.invoice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class InvoiceSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoiceSystemApplication.class, args);
	}

}
