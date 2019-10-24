package com.whuaz.spring.boot.oauth2.resource.controller;

import com.whuaz.spring.boot.oauth2.resource.dto.ResponseResult;
import com.whuaz.spring.boot.oauth2.resource.entity.TbContent;
import com.whuaz.spring.boot.oauth2.resource.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author potter.zhu
 * @date 2019/10/24
 */
@RestController
public class TbContentController {
    
    @Autowired
    private TbContentService tbContentService;
    
    @GetMapping("/")
    public ResponseResult<List<TbContent>> selectAll() {
        return new ResponseResult<>(HttpStatus.OK.value(), HttpStatus.OK.toString(), tbContentService.selectAll());
    }

    /**
     * 获取资源详情
     *
     * @param id
     * @return
     */
    @GetMapping("/view/{id}")
    public ResponseResult<TbContent> getById(@PathVariable Long id) {
        return new ResponseResult<>(HttpStatus.OK.value(), HttpStatus.OK.toString(), tbContentService.getById(id));
    }

    /**
     * 新增资源
     *
     * @param tbContent
     * @return
     */
    @PostMapping("/insert")
    public ResponseResult<Integer> insert(@RequestBody TbContent tbContent) {
        int count = tbContentService.insert(tbContent);

        if (count > 0) {
            return new ResponseResult<>(HttpStatus.OK.value(), HttpStatus.OK.toString(), count);
        } else {
            return new ResponseResult<>(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.toString());
        }
    }

    /**
     * 更新资源
     *
     * @param tbContent
     * @return
     */
    @PutMapping("/update")
    public ResponseResult<Integer> update(@RequestBody TbContent tbContent) {
        int count = tbContentService.update(tbContent);

        if (count > 0) {
            return new ResponseResult<>(HttpStatus.OK.value(), HttpStatus.OK.toString(), count);
        } else {
            return new ResponseResult<>(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.toString());
        }
    }

    /**
     * 删除资源
     *
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public ResponseResult<Integer> delete(@PathVariable Long id) {
        int count = tbContentService.delete(id);

        if (count > 0) {
            return new ResponseResult<>(HttpStatus.OK.value(), HttpStatus.OK.toString(), count);
        } else {
            return new ResponseResult<>(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.toString());
        }
    }

}
