package com.example.spring_inversion_ofcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInversionOfcontrolApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringInversionOfcontrolApplication.class, args);

//		MessageService emailService = new EmailService();
//
//		Client client = new Client(emailService);
//		client.processMessage("Hello World");

//		ApplicationContext context = SpringApplication.run(SpringInversionOfcontrolApplication.class, args);
//		EmailService emailService = context.getBean(EmailService.class);
//		emailService.senMessage("ABC");

		ApplicationContext context = SpringApplication.run(SpringInversionOfcontrolApplication.class, args);
		Client client = context.getBean(Client.class);
		client.processMessage("ABC");

	}

}
