package com.yanggaochao.springboot.learn.springbootjpalearn.security.dao;


import com.yanggaochao.springboot.learn.springbootjpalearn.security.domain.dao.RoleDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户服务数据接口类
 *
 * @author 杨高超
 * @since 2018-03-12
 */

@Repository
public interface RoleDao extends JpaRepository<RoleDO, Long> {
    @Query("SELECT R FROM RoleDO R ,RoleUserDO RU WHERE R.id = RU.roleId AND RU.userId = :userId")
    List<RoleDO> findRolesByUser(@Param("userId") Long userId);
}
