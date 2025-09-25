package com.sample.springtraining.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sample.springtraining.models.User;
import com.sample.springtraining.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        Iterable<User> iterable = userRepository.findAll(Sort.unsorted());
        List<User> users = new ArrayList<>();

        for (User user : iterable) {
            users.add(user);
        }
        return users;
    }
}
