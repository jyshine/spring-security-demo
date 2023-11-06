package com.example.demo.service;

import com.example.demo.controller.request.CreateUserRequest;
import com.example.demo.controller.request.LoginRequest;
import com.example.demo.controller.response.UserViewResponse;
import com.example.demo.entity.Users;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthticationService {
    private final UserRepository userRepository;

    public UserViewResponse saveUser(CreateUserRequest createUserRequest) {

        Users build = Users.builder()
                .userName(createUserRequest.getUserName())
                .email(createUserRequest.getEmail())
                .phone(createUserRequest.getPhone())
                .nickName(createUserRequest.getNickName())
                .password(createUserRequest.getPassword())
                .role(createUserRequest.getRole())
                .build();
        Users save = userRepository.save(build);
        return new UserViewResponse(save.getEmail(),save.getUsername(),save.getNickName(),save.getPhone());
    }

    public void login(LoginRequest loginRequest) {


    }
}
