package com.example.secrity.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @program: secrity
 * @description:
 * @author: ywd
 * @contact:1371690483@qq.com
 * @create: 2020-11-17 14:00
 **/
@Entity
@Table(name = "tb_user", schema = "secrity", catalog = "")

public class TbUserEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Basic
    @Column(name = "username", nullable = false, length = 50)
    private String username;

    @Basic
    @Column(name = "password", nullable = false, length = 64)
    private String password;

    @Basic
    @Column(name = "phone", nullable = true, length = 20)
    private String phone;

    @Basic
    @Column(name = "email", nullable = true, length = 50)
    private String email;

    @Basic
    @Column(name = "created", nullable = false)
    private Date created;

    @Basic
    @Column(name = "updated", nullable = false)
    private Date updated;
    /**
     * 配置多对多
     *  1·、声明表关系
     *       @ManyToMany(targetEntity = TbRoleEntity.class,fetch = FetchType.EAGER)
     *          targetEntity  ：代表对方的实体类字节码
     *   2、配置中间表（包含两个外键）
     *         @JoinTable
     *          name:中间表的名称
     *          JoinColumns : 配置当前对象在中间表的外键
     *               @JoinColumn
     *                  name 外键名称
     *
     *          inverseJoinColumns: 配置对方对象在中间表的外键
     */
    @JsonIgnoreProperties(value = { "users" })
    @ManyToMany(targetEntity = TbRoleEntity.class,fetch = FetchType.EAGER)
    @JoinTable(name = "tb_user_role",joinColumns = {

            @JoinColumn(name = "user_id",referencedColumnName = "id")
    },inverseJoinColumns = {@JoinColumn(name = "role_id",referencedColumnName = "id")})
    private Set<TbRoleEntity> roles = new HashSet<>();


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Set<TbRoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(Set<TbRoleEntity> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "TbUserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                ", roles=" + roles +
                '}';
    }
}
