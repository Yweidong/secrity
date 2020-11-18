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
@Table(name = "tb_role", schema = "secrity", catalog = "")

public class TbRoleEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Basic
    @Column(name = "parent_id", nullable = true)
    private Long parentId;

    @Basic
    @Column(name = "name", nullable = false, length = 64)
    private String name;

    @Basic
    @Column(name = "enname", nullable = false, length = 64)
    private String enname;

    @Basic
    @Column(name = "description", nullable = true, length = 200)
    private String description;


    @Basic
    @Column(name = "created", nullable = false)
    private Date created;

    @Basic
    @Column(name = "updated", nullable = false)
    private Date updated;

    @JsonIgnoreProperties(value = { "roles" })
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "roles",fetch = FetchType.LAZY)
    Set<TbUserEntity> users = new HashSet<>();


    @JsonIgnoreProperties(value = { "roles" })
    @ManyToMany(targetEntity = TbPermissionEntity.class,fetch = FetchType.EAGER)
    @JoinTable(name = "tb_role_permission",joinColumns = {

            @JoinColumn(name = "role_id",referencedColumnName = "id")
    },inverseJoinColumns = {@JoinColumn(name = "permission_id",referencedColumnName = "id")})
    private Set<TbPermissionEntity>  permissions = new HashSet<>();


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Set<TbUserEntity> getUsers() {
        return users;
    }

    public void setUsers(Set<TbUserEntity> users) {
        this.users = users;
    }

    public Set<TbPermissionEntity> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<TbPermissionEntity> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "TbRoleEntity{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", enname='" + enname + '\'' +
                ", description='" + description + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                ", permissions=" + permissions +
                '}';
    }
}
