package com.example.demo.controller;

import com.example.demo.controller.request.CreateUserRequest;
import com.example.demo.controller.response.UserViewResponse;
import com.example.demo.service.AuthticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthticationService authticationService;
    @PostMapping("/signup")
    public ResponseEntity<UserViewResponse> signup(@RequestBody CreateUserRequest createUserRequest) {
        return ResponseEntity.status(HttpStatus.OK).body(authticationService.saveUser(createUserRequest));
    }
}
