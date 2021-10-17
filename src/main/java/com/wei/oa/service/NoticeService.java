package com.wei.oa.service;


import com.wei.oa.dao.NoticeDao;
import com.wei.oa.entity.Notice;
import com.wei.oa.utils.MybatisUtils;

import java.util.List;

/**
 * @author wei
 * @date 2021/10/17 13:46
 * @description: TODO
 */
public class NoticeService {
    public List<Notice> getNoticeList(Long receiverId) {
        return (List)MybatisUtils.executeQuery(sqlSession -> {
            NoticeDao noticeDao = sqlSession.getMapper(NoticeDao.class);
            return noticeDao.selectByReceiverId(receiverId);
        });
    }
}
