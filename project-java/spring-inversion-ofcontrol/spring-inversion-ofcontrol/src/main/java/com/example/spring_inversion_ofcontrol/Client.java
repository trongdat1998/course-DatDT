package com.example.spring_inversion_ofcontrol;

public class Client {
    private MessageService messageService;

    public Client(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message){
        messageService.senMessage(message);
    }
}
