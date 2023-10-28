package com.example.demo.service;

import com.example.demo.controller.request.CreateUserRequest;
import com.example.demo.controller.response.UserViewResponse;
import com.example.demo.entity.Users;
import com.example.demo.mapper.UserViewMapper;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthticationService {

    private UserRepository userRepository;
    private UserViewMapper userViewMapper;

    public UserViewResponse saveUser(CreateUserRequest createUserRequest) {
//        Users byEmail = userRepository.findByEmail(createUserRequest.getEmail());
//        if (byEmail != null) {
//            throw new DuplicateKeyException("이미 존재하는 이메일 입니다.");
//        }
        Users users = userViewMapper.createUsers(createUserRequest);
        return userViewMapper.viewUser(userRepository.save(users));
    }

    public Users loginUser() {
        return null;
    }

}
