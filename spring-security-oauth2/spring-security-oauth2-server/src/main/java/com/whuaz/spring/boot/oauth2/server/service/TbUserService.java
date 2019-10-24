package com.whuaz.spring.boot.oauth2.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.whuaz.spring.boot.oauth2.server.entity.TbUser;

/**
 * @author potter.zhu
 * @date 2019/10/24
 */
public interface TbUserService extends IService<TbUser> {
    default TbUser getByUsername(String username) {
        return null;
    }
}
