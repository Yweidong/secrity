package com.example.secrity;

import com.example.secrity.entity.TbPermissionEntity;
import com.example.secrity.entity.TbRoleEntity;
import com.example.secrity.entity.TbUserEntity;
import com.example.secrity.service.TbUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.DoubleStream;

@SpringBootTest
class SecrityApplicationTests {

    @Autowired
    TbUserService tbUserService;

    @Test
    void contextLoads() {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }

    @Test
    void Test1() {
        TbUserEntity tbUser = tbUserService.getByUserName("admin");
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();

        if(tbUser!=null) {

            tbUser.getRoles().forEach(TbRoleEntity->{
                if(TbRoleEntity!=null ) {
                    TbRoleEntity.getPermissions().forEach(TbPermissionEntity->{
                        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(TbPermissionEntity.getEnname());
                        grantedAuthorities.add(grantedAuthority);

                    });
//
                }
            });

        }
        System.out.println(grantedAuthorities);
    }
}
