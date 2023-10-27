package com.example.demo.service;

import com.example.demo.controller.request.CreateUserRequest;
import com.example.demo.controller.response.UserViewResponse;
import com.example.demo.entity.Users;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthticationService {

    private UserRepository userRepository;

    public UserViewResponse saveUser(CreateUserRequest createUserRequest) {

        return null;
    }

    public Users loginUser() {
        return null;
    }

}
