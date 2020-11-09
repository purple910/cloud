package com.example.userconsume.service;

import com.example.userconsume.dao.UserDao;
import com.example.userconsume.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserService
 * @Description
 * @PackageName com.example.userconsume.service.UserService
 * @Author admin
 * @Date 2020/11/9    13:20
 **/
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public List<User> queryUserByIds(List<Long> ids){
        List<User> users = new ArrayList<>();
        for (Long id : ids) {
            User user = this.userDao.queryUserById(id);
            users.add(user);
        }
        return users;
    }
}
