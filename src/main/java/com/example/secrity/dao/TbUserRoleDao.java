package com.example.secrity.dao;

import com.example.secrity.entity.TbRoleEntity;
import com.example.secrity.entity.TbUserRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: secrity
 * @description:
 * @author: ywd
 * @contact:1371690483@qq.com
 * @create: 2020-11-17 14:44
 **/
public interface TbUserRoleDao extends JpaRepository<TbUserRoleEntity,Long> {
}
