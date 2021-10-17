package com.wei.oa.dao;

import com.wei.oa.entity.Employee;
import org.apache.ibatis.annotations.Param;

/**
 * @author wei
 * @date 2021/10/16 10:53
 * @description: TODO
 */
public interface EmployeeDao {
    public Employee selectById(Long employeeId);

    /**
     * 根据传入员工对象获取上级主管对象
     * @param employee 员工对象
     * @return 上级主管对象
     */
    public Employee selectLeader(@Param("emp") Employee employee);
}
