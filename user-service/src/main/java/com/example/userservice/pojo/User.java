package com.example.userservice.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName User
 * @Description
 * @PackageName com.example.userservice.pojo.User
 * @Author admin
 * @Date 2020/11/9    13:01
 **/
@Data
@Table(name = "user")
public class User {
    @Id
    private Long id;
    private String username;
    private String phone;
}
