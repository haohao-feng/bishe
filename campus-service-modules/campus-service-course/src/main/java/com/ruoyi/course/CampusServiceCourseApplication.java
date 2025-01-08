package com.ruoyi.course;

import com.ruoyi.common.security.annotation.EnableCustomConfig;
import com.ruoyi.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication
public class CampusServiceCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampusServiceCourseApplication.class, args);
    }

}
