<%--
  Created by IntelliJ IDEA.
  User: HengyiJANG
  Date: 2019-06-26
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>

<div>
    <strong> ${sessionScope.horseman.hmname}!!!!! </strong>
</div>
<form action="/horseman/outLogin">
    <table>
        <tr>
            <td><input type="submit" value="退出登录" ></td>
        </tr>
    </table>
</form>
</body>
</html>