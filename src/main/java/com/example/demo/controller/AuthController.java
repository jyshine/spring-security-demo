package com.example.demo.controller;

import com.example.demo.controller.request.CreateUserRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("signup")
    public ResponseEntity<String> signup(@RequestBody CreateUserRequest createUserRequest) {
        
        return ResponseEntity.status(HttpStatus.OK).body("ok");
    }
}
