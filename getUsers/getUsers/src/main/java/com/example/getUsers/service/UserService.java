package com.example.getUsers.service;

import com.example.getUsers.model.Users;
import com.example.getUsers.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<Users> getUserById(Long id) {
        return userRepository.findById(id);
    }
}
