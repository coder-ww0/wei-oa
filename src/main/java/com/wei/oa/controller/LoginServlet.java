package com.wei.oa.controller;

import com.alibaba.fastjson.JSON;
import com.wei.oa.entity.User;
import com.wei.oa.service.UserService;
import com.wei.oa.service.exception.BussinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wei
 * @date 2021/10/15 15:53
 * @description: TODO
 */
@WebServlet(name = "LoginServlet", urlPatterns = "/check_login")
public class LoginServlet extends HttpServlet {
    Logger logger = LoggerFactory.getLogger(LoginServlet.class);
    private UserService userService = new UserService();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Map<String, Object> result = new HashMap<>();
        try {
            User user = userService.checkLogin(username, password);
            HttpSession session = request.getSession();
            // 向session存入登录用户信息。属性名login_user
            session.setAttribute("login_user", user);
            result.put("code", "0");
            result.put("message", "success");
            result.put("redirect_url", "/index");
        } catch (BussinessException ex) {
            logger.error(ex.getMessage(), ex);
            result.put("code", ex.getCode());
            result.put("message", ex.getMessage());
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            result.put("code", ex.getClass().getSimpleName());
            result.put("message", ex.getMessage());
        }
        String json = JSON.toJSONString(result);
        response.getWriter().println(json);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
