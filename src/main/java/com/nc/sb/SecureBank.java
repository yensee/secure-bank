package com.nc.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecureBank {

	public static void main(String[] args) {
		SpringApplication.run(SecureBank.class, args);
		System.out.println("Secure Bank Application is Started ... ");
	}
}
