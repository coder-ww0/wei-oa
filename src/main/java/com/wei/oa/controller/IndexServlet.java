package com.wei.oa.controller;

import com.wei.oa.entity.Department;
import com.wei.oa.entity.Employee;
import com.wei.oa.entity.Node;
import com.wei.oa.entity.User;
import com.wei.oa.service.DepartmentService;
import com.wei.oa.service.EmployeeService;
import com.wei.oa.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author wei
 * @date 2021/10/15 19:48
 * @description: TODO
 */
@WebServlet(name = "IndexServlet", urlPatterns = "/index")
public class IndexServlet extends HttpServlet {
    private UserService userService = new UserService();
    private EmployeeService employeeService = new EmployeeService();
    private DepartmentService departmentService = new DepartmentService();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        // 得到当前登录用户对象
        User user = (User)session.getAttribute("login_user");
        // 得到当前员工的相关信息
        Employee employee = employeeService.selectById(user.getUserId());
        // 获取当前的员工的部门信息
        Department department = departmentService.selectById(employee.getDepartmentId());
        List<Node> nodeList = userService.selectNodeByUserId(user.getUserId());
        request.setAttribute("node_list", nodeList);
        session.setAttribute("current_employee", employee);
        session.setAttribute("current_department", department);
        request.getRequestDispatcher("/index.ftl").forward(request, response);
    }
}
