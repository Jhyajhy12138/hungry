<%--
  Created by IntelliJ IDEA.
  User: HengyiJANG
  Date: 2019-06-26
  Time: 09:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>

<div>
    <strong> welcome,${sessionScope.horseman.hmname}! </strong>
</div>
this is success page!

<a href="${pageContext.request.contextPath}/horseman/anotherpage">点我跳到另一个页面</a>
<a href="${pageContext.request.contextPath}/horseman/checkOrder">查看未接订单</a>
<form action="${pageContext.request.contextPath}/horseman/login">
    <table>
        <tr>
            <td><input type="submit" value="退出登录"></td>
        </tr>
        <tr>
            <td><input type="button" value="开始接单" onclick=""></td>
        </tr>
        <tr>
            <td><input type="button" value="查看订单" onclick=""></td>
        </tr>
    </table>
</form>


</body>
</html>
