package com.wei.oa.entity;

/**
 * @author wei
 * @date 2021/10/14 21:02
 * @description: TODO
 */
public class User {
    private Long userId;
    private String username;
    private String password;
    private Long employeeId;
    private Integer salt;

    public Integer getSalt() {
        return salt;
    }

    public void setSalt(Integer salt) {
        this.salt = salt;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
