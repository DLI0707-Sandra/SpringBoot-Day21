package com.example.getUsers.repository;

import com.example.getUsers.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}

