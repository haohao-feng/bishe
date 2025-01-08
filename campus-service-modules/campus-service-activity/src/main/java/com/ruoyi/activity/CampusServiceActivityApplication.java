package com.ruoyi.activity;

import com.ruoyi.common.security.annotation.EnableCustomConfig;
import com.ruoyi.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication
public class CampusServiceActivityApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampusServiceActivityApplication.class, args);
    }

}
