package com.example.spring_inversion_ofcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringInversionOfcontrolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringInversionOfcontrolApplication.class, args);

		MessageService emailService = new EmailService();

		Client client = new Client(emailService);
		client.processMessage("Hello World");
	}

}
