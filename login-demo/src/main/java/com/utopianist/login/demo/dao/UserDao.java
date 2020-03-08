package com.utopianist.login.demo.dao;

import com.utopianist.login.demo.entity.User;

/**
 * @program: login-demo
 * @description:
 * @author: utopianist
 * @create: 2020-03-05 11:26
 **/

public interface UserDao {
    public User login(String loginId, String loginPwd);
}