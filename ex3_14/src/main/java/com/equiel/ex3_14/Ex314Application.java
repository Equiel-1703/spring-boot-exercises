package com.equiel.ex3_14;

import com.equiel.ex3_14.userclass.User;
import com.equiel.ex3_14.userservice.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Ex314Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Ex314Application.class, args);

		UserService userService = context.getBean(UserService.class);

		// Creating a new User object (just for demonstration)
		// In a real application, we would typically get this data from a request or input
		User user = new User(1, "henrique@user.com", "123456", "Henrique");

		// Registering the user
		userService.registerUser(user);

		// Attempting to register the same user again to demonstrate the userExists check
		userService.registerUser(user);

		// Closing the application context
		context.close();
	}

}
