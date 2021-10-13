package com.wei.oa.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.function.Function;

/**
 * @author wei
 * @date 2021/10/13 15:39
 * @description: mybatis的相关配置
 */
public class MybatisUtils {
    /**
     *     利用static(静态)属于类不属于对象，且全局唯一
      */
    private static SqlSessionFactory sqlSessionFactory = null;
    static {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static Object executeQuery(Function<SqlSession, Object> func) {

    }
}
