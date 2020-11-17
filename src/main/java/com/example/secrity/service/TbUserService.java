package com.example.secrity.service;

import com.example.secrity.entity.TbUserEntity;

/**
 * @program: secrity
 * @description:
 * @author: ywd
 * @contact:1371690483@qq.com
 * @create: 2020-11-17 14:48
 **/
public interface TbUserService {
    TbUserEntity getByUserName(String username);

}
