package com.utopianist.login.demo.service.impl;

import com.utopianist.login.demo.dao.UserDao;
import com.utopianist.login.demo.dao.impl.UserDaoImpl;
import com.utopianist.login.demo.entity.User;
import com.utopianist.login.demo.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    public User login(String loginId, String loginPwd) {
        return userDao.login(loginId, loginPwd);
    }
}