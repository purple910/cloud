package com.example.userconsume.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description
 * @PackageName com.example.userconsume.pojo.User
 * @Author admin
 * @Date 2020/11/9    13:19
 **/
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String username;
    private String phone;
}
