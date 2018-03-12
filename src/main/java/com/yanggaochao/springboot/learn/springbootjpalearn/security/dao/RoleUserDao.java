package com.yanggaochao.springboot.learn.springbootjpalearn.security.dao;


import com.yanggaochao.springboot.learn.springbootjpalearn.security.domain.dao.RoleUserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 用户服务数据接口类
 *
 * @author 杨高超
 * @since 2018-03-12
 */

@Repository
public interface RoleUserDao extends JpaRepository<RoleUserDO, Long> {
    void deleteByRoleId(Long roleId);

    void deleteByUserId(Long userId);
}
