package com.whuaz.spring.boot.oauth2.server;

import com.whuaz.spring.boot.oauth2.server.service.TbPermissionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author potter.zhu
 * @date 2019/10/24
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OAuth2ServerApp.class)
public class TbPermissionServiceTest {

    @Autowired
    private TbPermissionService tbPermissionService;

    @Test
    public void testSelectByUserId() {
        tbPermissionService.selectByUserId(37L).forEach(System.out::println);
    }
}
