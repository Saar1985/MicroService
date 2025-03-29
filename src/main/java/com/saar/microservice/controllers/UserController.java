package com.saar.microservice.controllers;

import com.saar.microservice.pojos.users.UserData;
import com.saar.microservice.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public void CreateUser(@RequestBody UserData user)
    {
        userService.createUser(user);
    }

    @GetMapping
    public Iterable<UserData> GetAllUsers()
    {
        return userService.getAllUsers();
    }
}
