package com.example.userservice.service;

import com.example.userservice.mapper.UserMapper;
import com.example.userservice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Description
 * @PackageName com.example.userservice.service.UserService
 * @Author admin
 * @Date 2020/11/9    13:01
 **/
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
