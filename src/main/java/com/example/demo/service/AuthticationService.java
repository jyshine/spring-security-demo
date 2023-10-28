package com.example.demo.service;

import com.example.demo.mapper.UserViewMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthticationService {

    private final UserViewMapper userViewMapper;

}
