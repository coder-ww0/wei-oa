package com.wei.oa.service;

import com.wei.oa.dao.DepartmentDao;
import com.wei.oa.entity.Department;
import com.wei.oa.utils.MybatisUtils;

import javax.xml.bind.annotation.XmlType;

/**
 * @author wei
 * @date 2021/10/16 11:22
 * @description: TODO
 */
public class DepartmentService {
    public Department selectById(Long departmentId) {
        return (Department)MybatisUtils.executeQuery(sqlSession -> {
            DepartmentDao departmentDao = sqlSession.getMapper(DepartmentDao.class);
            return departmentDao.selectById(departmentId);
        });
    }
}
