package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USERS")
@Getter
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String userName;
    private String password;
    private String nickName;
    private String phone;
    @Enumerated(EnumType.STRING)
    private Role role;
}
