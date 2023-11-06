package com.example.demo.service;

import com.example.demo.config.jwt.JwtService;
import com.example.demo.controller.request.CreateUserRequest;
import com.example.demo.controller.request.LoginRequest;
import com.example.demo.controller.response.AuthenticationResponse;
import com.example.demo.controller.response.UserViewResponse;
import com.example.demo.entity.Users;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthticationService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    public UserViewResponse saveUser(CreateUserRequest createUserRequest) {

        Users build = Users.builder()
                .userName(createUserRequest.getUserName())
                .email(createUserRequest.getEmail())
                .phone(createUserRequest.getPhone())
                .nickName(createUserRequest.getNickName())
                .password(passwordEncoder.encode(createUserRequest.getPassword()))
                .role(createUserRequest.getRole())
                .build();
        Users save = userRepository.save(build);
        jwtService.generateToken(save);
        return new UserViewResponse(save.getEmail(),save.getUsername(),save.getNickName(),save.getPhone());
    }

    public AuthenticationResponse login(LoginRequest loginRequest) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getEmail(),
                        loginRequest.getPassword()
                )
        );

        Users users = userRepository.findByEmail(loginRequest.getEmail())
                .orElseThrow();
        String generateToken = jwtService.generateToken(users);
        return AuthenticationResponse.builder()
                .token(generateToken)
                .build();
    }
}
