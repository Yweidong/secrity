package com.example.secrity.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.context.annotation.Description;

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
@Table(name = "tb_permission", schema = "secrity", catalog = "")

public class TbPermissionEntity {

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
    @Column(name = "url", nullable = false, length = 255)
    private String url;

    @Basic
    @Column(name = "description", nullable = true, length = 200)
    private String description;

    @Basic
    @Column(name = "created", nullable = false)
    private Date created;
    @Basic
    @Column(name = "updated", nullable = false)
    private Date updated;

    @JsonIgnoreProperties(value = { "permissions" })
    @ManyToMany(targetEntity = TbRoleEntity.class,mappedBy = "permissions",fetch = FetchType.LAZY)
    Set<TbRoleEntity> roles = new HashSet<>();

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public Set<TbRoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(Set<TbRoleEntity> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "TbPermissionEntity{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", enname='" + enname + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
