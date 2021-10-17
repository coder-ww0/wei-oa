package com.wei.oa.dao;

import com.wei.oa.entity.ProcessFlow;
import com.wei.oa.utils.MybatisUtils;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author wei
 * @date 2021/10/16 15:34
 * @description: TODO
 */
public class ProcessFlowDaoTest {
    @Test
    public void testInsert() {
        MybatisUtils.executeUpdate(sqlSession -> {
            ProcessFlowDao dao = sqlSession.getMapper(ProcessFlowDao.class);
            ProcessFlow flow = new ProcessFlow();
            flow.setFormId(3L);
            flow.setOperatorId(2L);
            flow.setAction("audit");
            flow.setReason("approved");
            flow.setReason("同意");
            flow.setCreateTime(new Date());
            flow.setAuditTime(new Date());
            flow.setOrderNo(1);
            flow.setState("ready");
            flow.setIsLast(1);
            dao.insert(flow);
            return null;
    });
}}