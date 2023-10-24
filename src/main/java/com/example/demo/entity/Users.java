package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USERS")
public class Users {
    @Id
    private Long id;
    private String email;
    private String userName;
    private String password;
    private String nickName;
    private String phone;
}
