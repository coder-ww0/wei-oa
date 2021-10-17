package com.wei.oa.controller;

import com.alibaba.fastjson.JSON;
import com.wei.oa.entity.Notice;
import com.wei.oa.entity.User;
import com.wei.oa.service.NoticeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wei
 * @date 2021/10/17 13:53
 * @description: TODO
 */
@WebServlet(name = "NoticeServlet" ,urlPatterns = "/notice/list")
public class NoticeServlet extends HttpServlet {
    private NoticeService noticeService = new NoticeService();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("login_user");
        List<Notice> noticeList = noticeService.getNoticeList(user.getEmployeeId());
        Map result = new HashMap<>();
        result.put("code", "0");
        result.put("msg", "");
        result.put("count", noticeList.size());
        result.put("data", noticeList);
        String json = JSON.toJSONString(result);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(json);
    }
}
