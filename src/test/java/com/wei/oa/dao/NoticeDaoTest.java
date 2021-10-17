package com.wei.oa.dao;

import com.wei.oa.entity.Notice;
import com.wei.oa.utils.MybatisUtils;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author wei
 * @date 2021/10/16 15:45
 * @description: TODO
 */
public class NoticeDaoTest {
    @Test
    public void testInsert(){
        MybatisUtils.executeUpdate(sqlSession -> {
            NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
            Notice notice = new Notice();
            notice.setReceiverId(2L);
            notice.setContent("测试消息");
            notice.setCreateTime(new Date());
            dao.insert(notice);
            return null;
        });
    }
}