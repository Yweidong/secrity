package com.example.secrity.dao;

import com.example.secrity.entity.TbRoleEntity;
import com.example.secrity.entity.TbUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * @program: secrity
 * @description:
 * @author: ywd
 * @contact:1371690483@qq.com
 * @create: 2020-11-17 14:44
 **/
public interface TbUserDao extends JpaRepository<TbUserEntity,Long>, JpaSpecificationExecutor<TbUserEntity> {


      TbUserEntity  findByUsername(String username);

}
