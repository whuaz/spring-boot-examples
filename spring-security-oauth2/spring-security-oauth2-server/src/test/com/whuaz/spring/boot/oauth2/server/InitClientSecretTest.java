package com.whuaz.spring.boot.oauth2.server;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author potter.zhu
 * @date 2019/10/23
 */
public class InitClientSecretTest {

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
