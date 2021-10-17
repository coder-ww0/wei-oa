package com.wei.oa.service;

import com.wei.oa.dao.RbacDao;
import com.wei.oa.dao.UserDao;
import com.wei.oa.entity.Node;
import com.wei.oa.entity.User;
import com.wei.oa.service.exception.BussinessException;
import com.wei.oa.utils.MD5Utils;

import java.util.List;

/**
 * @author wei
 * @date 2021/10/14 21:15
 * @description: TODO
 */
public class UserService {
    private UserDao userDao = new UserDao();
    private RbacDao rbacDao = new RbacDao();

    public User checkLogin(String username, String password) {
        User user = userDao.selectByUsername(username);
        if (user == null) {
            // 抛出用户不存在异常
            throw new BussinessException("L001", "用户名不存在");
        }
        // 对前台输入的密码加盐混淆后生成MD5，与保存在数据库中的MD5密码进行比对
        String md5 = MD5Utils.md5Digest(password, user.getSalt());
        if (!md5 .equals(user.getPassword())) {
            throw new BussinessException("Loo2", "密码错误");
        }
        return user;
    }

    public List<Node> selectNodeByUserId(Long userId) {
        List<Node> nodeList = rbacDao.selectNodeByUserId(userId);
        return nodeList;
    }
}
