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
@TableName("tb_role")
public class TbRole implements Serializable {
    
    @TableId
    private Long id;

    private Long parentId;

    private String name;

    private String enname;

    private String description;

    private Date created;

    private Date updated;

    private static final long serialVersionUID = 1L;
}
