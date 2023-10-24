package com.example.demo.service;

import com.example.demo.entity.Users;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthticationService {

    private UserRepository userRepository;

    public void saveUser() {
    }

    public Users loginUser() {
        return null;
    }

}
