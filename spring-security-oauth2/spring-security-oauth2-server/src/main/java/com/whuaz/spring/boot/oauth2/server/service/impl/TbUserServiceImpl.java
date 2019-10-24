package com.whuaz.spring.boot.oauth2.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.whuaz.spring.boot.oauth2.server.entity.TbUser;
import com.whuaz.spring.boot.oauth2.server.mapper.TbUserMapper;
import com.whuaz.spring.boot.oauth2.server.service.TbUserService;
import org.springframework.stereotype.Service;

/**
 * @author potter.zhu
 * @date 2019/10/24
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserService {

    @Override
    public TbUser getByUsername(String username) {
        QueryWrapper<TbUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        return baseMapper.selectOne(queryWrapper);
    }
}
