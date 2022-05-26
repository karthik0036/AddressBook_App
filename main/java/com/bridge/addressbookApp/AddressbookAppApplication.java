package com.bridge.addressbookApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressbookAppApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to addressbook app");
		SpringApplication.run(AddressbookAppApplication.class, args);
	}

}
