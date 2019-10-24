package com.whuaz.spring.boot.oauth2.resource.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.whuaz.spring.boot.oauth2.resource.entity.TbContent;
import com.whuaz.spring.boot.oauth2.resource.mapper.TbContentMapper;
import com.whuaz.spring.boot.oauth2.resource.service.TbContentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author potter.zhu
 * @date 2019/10/24
 */
@Service
public class TbContentServiceImpl extends ServiceImpl<TbContentMapper, TbContent> implements TbContentService {

    @Override
    public TbContent getById(Long id) {
        return baseMapper.selectById(id);
    }

    @Override
    public List<TbContent> selectAll() {
        QueryWrapper<TbContent> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc();
        return baseMapper.selectList(queryWrapper);
    }

    @Override
    public int insert(TbContent tbContent) {
        return baseMapper.insert(tbContent);
    }

    @Override
    public int update(TbContent tbContent) {
        return baseMapper.updateById(tbContent);
    }

    @Override
    public int delete(Long id) {
        return baseMapper.deleteById(id);
    }
}
