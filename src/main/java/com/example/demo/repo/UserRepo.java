package com.example.demo.repo;

import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public
interface UserRepo extends JpaRepository<User, Long> {
        User findByUsername(String email);
        User findByName(String name);
        User findByGoogleUsername(String googleUsername);
        User findByGoogleName(String googleName);
    }