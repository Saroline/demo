package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;

import java.security.PublicKey;

/**
 * @author Saroline
 * @date 2020/1/10 - 10:38
 */
@Controller
public class UserController {
    UserService userService;
    public UserEntity Login(String username,String password){
        return userService.loginTest(username, password);
    }
}
