package com.utopianist.login.demo.dao.impl;

import com.utopianist.login.demo.dao.UserDao;
import com.utopianist.login.demo.entity.User;

/**
  * @Title:
  * @ClassName: com.utopianist.login.demo.dao.impl.UserDaoImpl.java
  * @Description:
  *
  * @Copyright 2016-2018 公司名称 - Powered By 研发中心
  * @author: 作者名
  * @date:  2020-03-05 11:54
  * @version V1.0
  */


public class UserDaoImpl implements UserDao {
    
    public User login(String loginId, String loginPwd) {
        User user = null;

        if("admin".equals(loginId)){
            if ("admin".equals(loginPwd)) {
                user = new User();
                user.setLoginId("admin");
                user.setLoginPwd("admin");
                user.setUsername("utopianist");
            }

        }
        return user;
    }
    
}