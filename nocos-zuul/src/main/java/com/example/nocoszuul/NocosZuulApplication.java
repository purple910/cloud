package com.example.nocoszuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class NocosZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(NocosZuulApplication.class, args);
    }

}
