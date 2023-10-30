package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "USERS")
@Getter
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

    @Builder
    public Users(String email, String userName, String password, String nickName, String phone, Role role) {
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.nickName = nickName;
        this.phone = phone;
        this.role = role;
    }
}
