package com.example.demo.mapper;


import com.example.demo.controller.request.CreateUserRequest;
import com.example.demo.controller.response.UserViewResponse;
import com.example.demo.entity.Users;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserViewMapper {
    Users createUsers(CreateUserRequest createUserRequest);

    UserViewResponse viewUser(Users users);
}
