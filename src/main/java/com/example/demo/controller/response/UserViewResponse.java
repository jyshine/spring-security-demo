package com.example.demo.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserViewResponse {
    private String email;
    private String userName;
    private String nickName;
    private String phone;
}
