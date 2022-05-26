package com.bridge.addressbookApp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class AddressbookAppApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to addressbook app");
		ApplicationContext context = SpringApplication.run(AddressbookAppApplication.class, args);
		log.info("AddressBook App Started in {} Environment",
				context.getEnvironment().

						getProperty("environment"));
		log.info("AddressBook App DB User is {}",
				context.getEnvironment().getProperty("spring.datasource.username"));
	}

}
