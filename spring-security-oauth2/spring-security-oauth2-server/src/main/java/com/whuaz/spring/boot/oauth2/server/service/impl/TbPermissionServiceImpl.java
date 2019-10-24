package com.whuaz.spring.boot.oauth2.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.whuaz.spring.boot.oauth2.server.entity.TbPermission;
import com.whuaz.spring.boot.oauth2.server.mapper.TbPermissionMapper;
import com.whuaz.spring.boot.oauth2.server.service.TbPermissionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author potter.zhu
 * @date 2019/10/24
 */
@Service
public class TbPermissionServiceImpl extends ServiceImpl<TbPermissionMapper, TbPermission> implements TbPermissionService {
    
    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return baseMapper.selectByUserId(userId);
    }
}
