package com.saar.microservice.services;

import com.saar.microservice.database.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import com.saar.microservice.pojos.users.UserData;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(UserData user) {
        userRepository.save(user);
    }

    public List<UserData> getAllUsers() {
        return userRepository.findAll();
    }
}
