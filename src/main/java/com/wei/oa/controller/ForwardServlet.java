package com.wei.oa.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wei
 * @date 2021/10/16 20:31
 * @description: 进行页面跳转
 */
@WebServlet(name = "ForwardServlet", urlPatterns = "/forward/*")
public class ForwardServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        String subUri = uri.substring(1);
        String page = subUri.substring(subUri.indexOf("/"));
        request.getRequestDispatcher(page + ".ftl").forward(request, response);
    }
}
