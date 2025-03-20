package com.example.demo.controller;

import com.example.demo.model.dto.UserDto2;
import com.example.demo.service.UserService;
import com.example.demo.service.UserService2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users2")
public class UserController2 {

    @Autowired
    private UserService2 userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto2> getUserById(@PathVariable String userId) {
        UserDto2 user = userService.getUserById(userId);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<List<UserDto2>> getAllUsers() {
        List<UserDto2> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody UserDto2 user) {
        userService.createUser(user);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{userId}")
    public ResponseEntity<Void> updateUser(@PathVariable String userId, @RequestBody UserDto2 user) {
        user.setUserId(userId);
        userService.updateUser(user);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
        return ResponseEntity.ok().build();
    }
}