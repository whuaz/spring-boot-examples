package com.whuaz.spring.boot.oauth2.resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author potter.zhu
 * @date 2019/10/24
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.whuaz.spring.boot.oauth2.resource.mapper"})
public class OAuth2ResourceApp {
    public static void main(String[] args) {
        SpringApplication.run(OAuth2ResourceApp.class, args);
    }
}
