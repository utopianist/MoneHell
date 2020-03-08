package com.utopianist.login.demo.web.controller;

import com.utopianist.login.demo.entity.User;
import com.utopianist.login.demo.service.UserService;
import com.utopianist.login.demo.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @Title:
 * @ClassName: com.utopianist.login.demo.web.controller.LoginController.java
 * @Description: 登录控制器
 *
 * @Copyright 2016-2018 公司名称 - Powered By 研发中心
 * @author: utopianist
 * @date:  2020-03-05 14:06
 * @version V1.0
 */
public class LoginController extends HttpServlet {

    private UserService userService = new UserServiceImpl();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginId = req.getParameter("loginId");
        String loginPwd = req.getParameter("loginPwd");

        User user = userService.login(loginId, loginPwd);
        if (user == null) {
            req.getRequestDispatcher("fail.jsp").forward(req, resp);

        } else {
            req.getRequestDispatcher("success.jsp").forward(req, resp);
        }

    }
}