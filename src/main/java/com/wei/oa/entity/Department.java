package com.wei.oa.entity;

/**
 * @author wei
 * @date 2021/10/16 11:18
 * @description: TODO
 */
public class Department {
    private Long departmentId;
    private String departmentName;

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
