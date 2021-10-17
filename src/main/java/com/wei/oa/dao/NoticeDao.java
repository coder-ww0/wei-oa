package com.wei.oa.dao;

import com.wei.oa.entity.Notice;

import java.util.List;

/**
 * @author wei
 * @date 2021/10/16 15:40
 * @description: TODO
 */
public interface NoticeDao {
    public void insert(Notice notice);

    public List<Notice> selectByReceiverId(Long receiverId);
}
