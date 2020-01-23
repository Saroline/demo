package com.example.demo.repository;

import com.example.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Saroline
 * @date 2020/1/10 - 10:38
 */
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    UserEntity findByUsesrname(String username);
}
