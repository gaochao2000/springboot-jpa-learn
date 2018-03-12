package com.yanggaochao.springboot.learn.springbootjpalearn.security.domain.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 角色用户关系实体类
 *
 * @author 杨高超
 * @since 2018-03-12
 */
@Entity
@IdClass(RoleUserDO.class)
@Table(name = "AUTH_ROLE_USER")
public class RoleUserDO implements Serializable {
    @Id
    private Long roleId;
    @Id
    private Long userId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
