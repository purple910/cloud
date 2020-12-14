package com.example.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RefreshScope //打开动态刷新功能
public class UserController {

	@Value("${user.name:null}")
	private String name;
	@Value("${username:null}")
	private String username;
	@Value("${user.id:null}")
	private String id;
	@Value("${user.age:null}")
	private String age;

	@RequestMapping(value = "/getUser")
	@ResponseBody
	public String getUser() {
		return username+name+id+age;
	}


}
