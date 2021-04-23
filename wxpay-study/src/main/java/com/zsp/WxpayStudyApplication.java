package com.zsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//微信不支持个人用户使用，直接裂开
public class WxpayStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxpayStudyApplication.class, args);
    }

}
