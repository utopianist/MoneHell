package com.utopianist.login.demo.service;

import com.utopianist.login.demo.entity.User;

public interface UserService {

    public User login(String loginId, String loginPwd);
}