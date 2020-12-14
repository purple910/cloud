package com.example.userconsume.controller;

import com.example.userconsume.pojo.User;
import com.example.userconsume.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName ConsumerController
 * @Description
 * @PackageName com.example.userconsume.controller.ConsumerController
 * @Author admin
 * @Date 2020/11/9    13:19
 **/
@RestController
@RequestMapping("consume")
public class ConsumerController {
    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> consume(@RequestParam("ids") List<Long> ids) {
        return this.userService.queryUserByIds(ids);
    }
}
