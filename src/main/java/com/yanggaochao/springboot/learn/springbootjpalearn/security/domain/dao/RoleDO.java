package com.yanggaochao.springboot.learn.springbootjpalearn.security.domain.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 角色实体类
 *
 * @author 杨高超
 * @since 2018-03-12
 */
@Entity
@Table(name = "AUTH_ROLE")
public class RoleDO {
    @Id
    private Long id;
    @Column(length = 32)
    private String name;
    @Column(length = 64)
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
