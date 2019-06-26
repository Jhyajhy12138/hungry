<%--
  Created by IntelliJ IDEA.
  User: HengyiJANG
  Date: 2019-06-26
  Time: 09:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/horseman/checkLogin" method="post">
    <table>
        <tr>
            <td>用户名:</td>
            <td><input id="hmname" name="hmname" type="text"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input id="hmpassword" name="hmpassword" type="password"></td>
        </tr>
        <tr >
            <td><input type="submit" value="登录"  ></td>
            <td><input type="button" value="注册" onclick="window.location.href='regist'"> </td>
        </tr>

    </table>
</form>
</body>
</html>
