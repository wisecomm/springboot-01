package com.example.demo.service;

import com.example.demo.mapper.UserMapper2;
import com.example.demo.model.dto.UserDto;
import com.example.demo.model.dto.UserDto2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService2 {

    @Autowired
    private UserMapper2 userMapper;

    public UserDto2 getUserById(String userId) {
        return userMapper.selectUserById(userId);
    }

    public List<UserDto2> getAllUsers() {
        return userMapper.selectAllUsers();
    }

    public void createUser(UserDto2 user) {
        userMapper.insertUser(user);
    }

    public void updateUser(UserDto2 user) {
        userMapper.updateUser(user);
    }

    public void deleteUser(String userId) {
        userMapper.deleteUser(userId);
    }
}