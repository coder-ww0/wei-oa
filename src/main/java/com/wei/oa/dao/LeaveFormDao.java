package com.wei.oa.dao;

import com.wei.oa.entity.LeaveForm;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author wei
 * @date 2021/10/16 15:05
 * @description: TODO
 */
public interface LeaveFormDao {
    public void insert(LeaveForm form);

    public List<Map> selectByParams(@Param("pf_state") String pfState, @Param("pf_operator_id") Long operator);

    public LeaveForm selectById(Long formId);

    public void update(LeaveForm form);
}
