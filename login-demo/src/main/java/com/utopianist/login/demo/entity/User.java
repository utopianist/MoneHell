package com.utopianist.login.demo.entity;

/**
 * @program: login-demo
 * @description: 用户表
 * @author: utopianist
 * @create: 2020-03-05 00:16
 **/

public class User {
    private String username;
    private String loginId;
    private String loginPwd;
    //control + return 快捷键

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", loginId='" + loginId + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                '}';
    }
}