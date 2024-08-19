package com.example.filterUsers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.filterUsers.model.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByAgeAndCity(int age, String city);
    List<User> findByAge(int age);
    List<User> findByCity(String city);
}


