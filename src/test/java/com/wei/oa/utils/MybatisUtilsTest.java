package com.wei.oa.utils;

import org.junit.Test;

/**
 * @author wei
 * @date 2021/10/13 19:10
 * @description: TODO
 */
public class MybatisUtilsTest {
    @Test
    public void testcase1() {
        String result = (String)MybatisUtils.executeQuery(sqlSession -> {
            String out = (String)sqlSession.selectOne("test.sample");
            return out;
        });
        System.out.println(result);
    }
    @Test
    public void testcase2() {
        String result = (String) MybatisUtils.executeQuery(sqlSession -> sqlSession.selectOne("test.sample"));
        System.out.println(result);
    }
}
