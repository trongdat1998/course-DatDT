package com.example.spring_inversion_ofcontrol;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService{

    @Override
    public void senMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}
