package com.example.secrity.config.service;

import com.example.secrity.entity.TbRoleEntity;
import com.example.secrity.entity.TbUserEntity;
import com.example.secrity.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @program: secrity
 * @description:
 * @author: ywd
 * @contact:1371690483@qq.com
 * @create: 2020-11-17 11:45
 **/
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    TbUserService tbUserService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        TbUserEntity tbUser = tbUserService.getByUserName(s);
//        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
//        if(tbUser!=null) {
//            Set<TbRoleEntity> roles = tbUser.getRoles();
//            roles.forEach(TbRoleEntity->{
//                if(TbRoleEntity!=null ) {
//
//                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
//                    grantedAuthorities.add(grantedAuthority);
//                }
//            });
//        }
        return null;

    }
}
