package com.example.userconsume.dao;

import com.example.userconsume.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName UserDao
 * @Description
 * @PackageName com.example.userconsume.dao.UserDao
 * @Author admin
 * @Date 2020/11/9    13:20
 **/
@Component
public class UserDao {
    @Autowired
    private RestTemplate restTemplate;

    public User queryUserById(Long id){
        String url = "http://localhost:8081/user/" + id;
        return this.restTemplate.getForObject(url, User.class);
    }
}
