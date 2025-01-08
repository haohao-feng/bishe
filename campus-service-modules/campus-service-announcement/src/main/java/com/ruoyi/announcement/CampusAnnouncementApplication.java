package com.ruoyi.announcement;

import com.ruoyi.common.security.annotation.EnableCustomConfig;
import com.ruoyi.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName CampusAnnouncementApplication
 * @Description TODO
 * @Author wwf
 * @DATE 2025/2/3 16:18
 * @Version 1.0
 */
@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication
public class CampusAnnouncementApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(CampusAnnouncementApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  校园公告模块启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
