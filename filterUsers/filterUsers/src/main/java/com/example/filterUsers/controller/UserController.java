package com.example.filterUsers.controller;

import com.example.filterUsers.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.filterUsers.service.UserService;
import com.example.filterUsers.model.User;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/users")
    public User createEmployee(@RequestBody User user) {
        return userRepository.save(user);
    }


    @GetMapping("/users/filter")
    public List<User> filterUsers(@RequestParam(required = false) Integer age,
                                  @RequestParam(required = false) String city) {
        return userService.filterUsers(age, city);
    }
}
