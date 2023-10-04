package com.example.SchoolMagement.repositery;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SchoolMagement.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
