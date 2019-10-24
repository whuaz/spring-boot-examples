package com.whuaz.spring.boot.oauth2.server.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author potter.zhu
 * @date 2019/10/24
 */
@Data
@TableName("tb_user")
public class TbUser implements Serializable {
    
    @TableId("id")
    private Long id;

    private String username;

    private String password;

    private String phone;

    private String email;

    private Date created;

    private Date updated;

    private static final long serialVersionUID = 1L;
}
