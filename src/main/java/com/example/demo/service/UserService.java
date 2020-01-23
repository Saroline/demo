package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import org.springframework.stereotype.Service;

/**
 * @author Saroline
 * @date 2020/1/10 - 10:37
 */

@Service
public interface UserService {
    UserEntity loginTest(String username,String password);
}
