package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import jdk.internal.jline.internal.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Saroline
 * @date 2020/1/10 - 10:45
 */
@Service
@Slf4j
public class serviceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public UserEntity loginTest(String username, String password) {

        UserEntity userEntity= userRepository.findByUsesrname(username);
        if (userEntity==null){
            System.out.println("用户不存在");
        }
        if (!userEntity.getPassword().equals(password)) {
            System.out.println("账号或密码错误");
        }
        return userEntity;
    }
}
