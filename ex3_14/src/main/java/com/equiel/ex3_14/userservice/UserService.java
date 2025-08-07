package com.equiel.ex3_14.userservice;

import com.equiel.ex3_14.notificationservice.NotificationService;
import com.equiel.ex3_14.userclass.User;
import com.equiel.ex3_14.userrepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    private NotificationService notificationService;

    @Autowired
    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(User user) {
        if (userRepository.userExists(user.getEmail())) {
            System.out.println("USER ALREADY EXISTS");
            return;
        }

        userRepository.save(user);
        notificationService.send("Welcome to our service, " + user.getName() + "!", user.getEmail());
        System.out.println("USER REGISTERED");
    }
}
