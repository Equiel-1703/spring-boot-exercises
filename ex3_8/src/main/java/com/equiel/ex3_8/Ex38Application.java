package com.equiel.ex3_8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ex38Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ex38Application.class, args);

		NotificationManager manager = context.getBean(NotificationManager.class);
		manager.sendNotification("Olá mundo!");
	}

}
