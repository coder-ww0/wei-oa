package com.wei.oa.service;

import com.wei.oa.entity.Node;
import com.wei.oa.entity.User;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author wei
 * @date 2021/10/14 21:28
 * @description: TODO
 */
public class UserServiceTest {
    private UserService userService = new UserService();

    @Test
    public void checkLogin1() {
        userService.checkLogin("uu", "test");
    }
    @Test
    public void checkLogin2() {
        userService.checkLogin("t7", "123");
    }
    @Test
    public void checkLogin3() {
        User user = userService.checkLogin("t7", "test");
        System.out.println(user);
    }
    @Test
    public void selectNodeByUserId() {
        List<Node> list = userService.selectNodeByUserId(1L);
        System.out.println(list);
    }
}