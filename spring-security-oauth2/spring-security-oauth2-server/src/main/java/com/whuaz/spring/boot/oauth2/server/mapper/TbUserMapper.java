package com.whuaz.spring.boot.oauth2.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whuaz.spring.boot.oauth2.server.entity.TbUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author potter.zhu
 * @date 2019/10/24
 */
@Mapper
public interface TbUserMapper extends BaseMapper<TbUser> {
    
    
}
