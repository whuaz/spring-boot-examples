package com.whuaz.spring.boot.oauth2.server.config.service;

import com.whuaz.spring.boot.oauth2.server.entity.TbPermission;
import com.whuaz.spring.boot.oauth2.server.entity.TbUser;
import com.whuaz.spring.boot.oauth2.server.service.TbPermissionService;
import com.whuaz.spring.boot.oauth2.server.service.TbUserService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author potter.zhu
 * @date 2019/10/24
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    
    @Autowired
    private TbUserService tbUserService;
    
    @Autowired
    private TbPermissionService tbPermissionService;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TbUser tbUser = tbUserService.getByUsername(username);
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        if (tbUser != null) {
            // 获取用户授权
            List<TbPermission> tbPermissions = tbPermissionService.selectByUserId(tbUser.getId());
            
            tbPermissions.forEach(tbPermission -> {
                if (tbPermission != null && tbPermission.getEnname() != null) {
                    SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                    grantedAuthorities.add(simpleGrantedAuthority);
                }
            });
        }
        return new User(tbUser.getUsername(), tbUser.getPassword(), grantedAuthorities);
    }
}
