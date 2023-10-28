package com.example.demo.mapper;


import com.example.demo.controller.request.CreateUserRequest;
import com.example.demo.controller.response.UserViewResponse;
import com.example.demo.entity.Users;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class UserViewMapper {
    public abstract Users createUsers(CreateUserRequest createUserRequest);

    public abstract UserViewResponse viewUser(Users users);
}
