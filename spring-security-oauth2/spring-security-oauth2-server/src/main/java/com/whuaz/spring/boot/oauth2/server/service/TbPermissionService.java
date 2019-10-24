package com.whuaz.spring.boot.oauth2.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.whuaz.spring.boot.oauth2.server.entity.TbPermission;

import java.util.List;

/**
 * @author potter.zhu
 * @date 2019/10/24
 */
public interface TbPermissionService extends IService<TbPermission> {
    default List<TbPermission> selectByUserId(Long userId) {
        return null;
    }
}
