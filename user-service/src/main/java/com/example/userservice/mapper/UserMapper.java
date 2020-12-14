package com.example.userservice.mapper;

import com.example.userservice.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName UserMapper
 * @Description
 * @PackageName com.example.userservice.mapper.UserMapper
 * @Author admin
 * @Date 2020/11/9    13:02
 **/
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User>{
}
