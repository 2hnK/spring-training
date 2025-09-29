package com.sample.springtraining.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springtraining.models.User;
import com.sample.springtraining.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/{nickname}")
    public User getUserByNickname(@PathVariable("nickname") String nickname) {
        return userService.findUserByNickname(nickname);
    }

    @GetMapping("/email")
    public List<User> getUsersOrderByEmail() {
        return userService.findUsersOrderByEmail();
    }
}
