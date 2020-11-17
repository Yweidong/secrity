package com.example.secrity.dao;

import com.example.secrity.entity.TbPermissionEntity;
import com.example.secrity.entity.TbRolePermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: secrity
 * @description:
 * @author: ywd
 * @contact:1371690483@qq.com
 * @create: 2020-11-17 14:44
 **/
public interface TbRolePermissionDao extends JpaRepository<TbRolePermissionEntity,Long> {
}
