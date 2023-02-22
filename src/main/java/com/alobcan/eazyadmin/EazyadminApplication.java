package com.alobcan.eazyadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class EazyadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazyadminApplication.class, args);
	}

}
