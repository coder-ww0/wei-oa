package com.wei.oa.dao;

import com.wei.oa.entity.ProcessFlow;

import java.util.List;

/**
 * @author wei
 * @date 2021/10/16 15:27
 * @description: TODO
 */
public interface ProcessFlowDao {
    public void insert(ProcessFlow processFlow);

    public void update(ProcessFlow processFlow);

    public List<ProcessFlow> selectByFormId(Long formId);
}
