package com.example.secrity.service.impl;

import com.example.secrity.dao.TbUserDao;
import com.example.secrity.entity.TbUserEntity;
import com.example.secrity.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: secrity
 * @description:
 * @author: ywd
 * @contact:1371690483@qq.com
 * @create: 2020-11-17 14:49
 **/
@Service
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    TbUserDao tbUserDao;

    @Override
    public TbUserEntity getByUserName(String username) {

        return  tbUserDao.findByUsername(username);
    }
}
