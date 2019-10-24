package com.whuaz.spring.boot.oauth2.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author potter.zhu
 * @date 2019/10/23
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.whuaz.spring.boot.oauth2.server.mapper"})
public class OAuth2ServerApp {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServerApp.class, args);
    }
    
}
