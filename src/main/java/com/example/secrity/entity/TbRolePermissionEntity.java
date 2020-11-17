package com.example.secrity.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

/**
 * @program: secrity
 * @description:
 * @author: ywd
 * @contact:1371690483@qq.com
 * @create: 2020-11-17 14:00
 **/
@Entity
@Table(name = "tb_role_permission", schema = "secrity", catalog = "")

public class TbRolePermissionEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Basic
    @Column(name = "role_id", nullable = false)
    private long roleId;

    @Basic
    @Column(name = "permission_id", nullable = false)
    private long permissionId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(long permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public String toString() {
        return "TbRolePermissionEntity{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", permissionId=" + permissionId +
                '}';
    }
}
