package com.wei.oa.dao;

import com.wei.oa.entity.User;
import com.wei.oa.utils.MybatisUtils;

/**
 * @author wei
 * @date 2021/10/14 21:11
 * @description: TODO
 */
public class UserDao {
    /**
     * 按用户名查询用户表
     * @param username 用户名
     * @return User对象包含对应的用户信息，null则代表对象不存在
     */
    public User selectByUsername(String username) {
        User user = (User) MybatisUtils.executeQuery(sqlSession -> sqlSession.selectOne("usermapper.selectByUsername", username));
        return user;
    }
}
