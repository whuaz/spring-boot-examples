package com.whuaz.spring.boot.oauth2.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whuaz.spring.boot.oauth2.server.entity.TbPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author potter.zhu
 * @date 2019/10/24
 */
@Mapper
public interface TbPermissionMapper extends BaseMapper<TbPermission> {
    
    List<TbPermission> selectByUserId(@Param("userId") Long userId);
}
