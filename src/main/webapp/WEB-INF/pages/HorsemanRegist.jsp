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
    <script type="text/javascript">
        function check1(){
            var d=document.getElementById('t1').value;//首先通过文本框的id获取它的值然后进行判断
            if(d.length==11){//如果输入的字符大于5就给个对话框
                alert("请输入十一位电话号码");
            }
        }
        function check2(){
            var d=document.getElementById('t2').value;//首先通过文本框的id获取它的值然后进行判断
            if(d.length==18){//如果输入的字符大于5就给个对话框
                alert("请输入正确的身份证号");
            }
        }
    </script>
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
                <input id="t2" type="text" name="hmidcard" id="hmidcard" onkeypress="check2()">
            </td>
        </tr>
        <tr height="35px">
            <td>手机号</td>
            <td>
                <input id="t1" type="text" name="hmphone" id="hmphone" onkeypress="check1()">
            </td>
        </tr>
        <tr>

            <td colspan="2" align="center">
                <input type="submit" id="regist" value="注册"/>
                <input type="button"  value="返回" onclick="window.location.href='login'"/>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
