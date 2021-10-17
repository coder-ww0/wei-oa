package com.wei.oa.service;

import com.wei.oa.dao.EmployeeDao;
import com.wei.oa.entity.Employee;
import com.wei.oa.utils.MybatisUtils;

/**
 * @author wei
 * @date 2021/10/16 11:01
 * @description: TODO
 */
public class EmployeeService {
    public Employee selectById(Long employeeId) {
        return (Employee) MybatisUtils.executeQuery(sqlSession -> {
            EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
            return employeeDao.selectById(employeeId);
        });
    }
}
