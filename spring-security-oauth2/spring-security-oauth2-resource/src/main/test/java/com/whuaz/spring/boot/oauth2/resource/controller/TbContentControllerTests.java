package com.whuaz.spring.boot.oauth2.resource.controller;

import com.whuaz.spring.boot.oauth2.resource.OAuth2ResourceApp;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

/**
 * @author potter.zhu
 * @date 2019/10/24
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OAuth2ResourceApp.class)
@AutoConfigureMockMvc
public class TbContentControllerTests {

    @Autowired
    private MockMvc mockMvc;
    
    @Test
    public void selectAllTest() throws Exception {
        int status = this.mockMvc
                .perform(MockMvcRequestBuilders
                .get("/")
                .header("Authorization", "Bearer 91317816-5036-4b76-86b7-05d96d55774d"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn().getResponse().getStatus();
        if (status == 200) {
            log.info("请求成功");
        } else {
            log.error("请求失败， 状态码为: {}", status);
        }
        Assert.assertEquals(status, 200);
    }
}
