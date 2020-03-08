<%--
  Created by IntelliJ IDEA.
  User: yansunshine
  Date: 2020-03-05
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="/login" method="post">
    <input name="loginId" type="text"/>
    <input name="loginPwd" type="password"/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
