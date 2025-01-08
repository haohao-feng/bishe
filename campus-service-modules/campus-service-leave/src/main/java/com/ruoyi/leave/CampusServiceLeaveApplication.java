package com.ruoyi.leave;

import com.ruoyi.common.security.annotation.EnableCustomConfig;
import com.ruoyi.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication
public class CampusServiceLeaveApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampusServiceLeaveApplication.class, args);
	}

}
