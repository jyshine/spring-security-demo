package com.example.demo.controller.request;

import com.example.demo.entity.Role;
import lombok.Data;

@Data
public class CreateUserRequest {
    private String email;
    private String userName;
    private String password;
    private String nickName;
    private String phone;
    private Role role;
}
