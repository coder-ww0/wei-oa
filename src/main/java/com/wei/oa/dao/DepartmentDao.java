package com.wei.oa.dao;

import com.wei.oa.entity.Department;

/**
 * @author wei
 * @date 2021/10/16 11:19
 * @description: TODO
 */
public interface DepartmentDao {
    public Department selectById(Long departmentId);
}
