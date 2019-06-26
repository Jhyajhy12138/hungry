<%--
  Created by IntelliJ IDEA.
  User: HengyiJANG
  Date: 2019-06-26
  Time: 09:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<h3>注册页面</h3>
<hr/>
<form action="${pageContext.request.contextPath}/horseman/doRegist" method="post">
    <table border="1px">
        <tr height="35px">
            <td width="150px">用户名</td>
            <td width="300px">
                <input type="text" name="hmname" id="hmname">
            </td>
        </tr>
        <tr height="35px">
            <td>密码</td>
            <td>
                <input type="text" name="hmpassword" id="hmpassword">
            </td>
        </tr>
        <tr height="35px">
            <td>身份证号</td>
            <td>
                <input type="text" name="hmidcard" id="hmidcard">
            </td>
        </tr>
        <tr height="35px">
            <td>手机号</td>
            <td>
                <input type="text" name="hmphone" id="hmphone">
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" id="regist" value="注册"/>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
