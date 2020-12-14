package com.example.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Controller
public class OrderController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/getOrder")
	@ResponseBody
	public Map<String, Object> getOrder() {
		Map<String, Object> order = new HashMap<>();
		order.put("username", queryUserName());
		order.put("money", 100.00);
		return order;
	}

	private String queryUserName() {

		try {
			return restTemplate.getForObject("http://nacos-config-example/getUser", String.class);
		} catch (Exception e) {
			System.out.println("error");
		}
		return null;
	}
}
