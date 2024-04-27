package com.books.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BooksNetworkApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksNetworkApiApplication.class, args);
	}

}
