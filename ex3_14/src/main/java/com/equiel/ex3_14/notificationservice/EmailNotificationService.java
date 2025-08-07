package com.equiel.ex3_14.notificationservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EmailNotificationService implements NotificationService {
    @Value("${mail-server.url}")
    private String mailServerUrl;
    @Value("${mail-server.protocol}")
    private String mailServerProtocol;
    @Value("${mail-server.port}")
    private String mailServerPort;

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Sending email via " + mailServerProtocol + " to " + mailServerUrl + ":" + mailServerPort);
        System.out.println("DESTINATION: " + recipientEmail);
        System.out.println("MESSAGE: " + message);
    }
}
