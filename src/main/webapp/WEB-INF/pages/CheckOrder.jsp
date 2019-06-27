<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/6/27
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
CheckOrder
<br>
<%
    List<Map> list = (List<Map>)session.getAttribute("list");
    for(Map<String,Object> map : list){
        Iterator<String> iterator = map.keySet().iterator();
        if (iterator.hasNext()){
            String key = iterator.next();
            String glocation = (String) map.get(key);
            key = iterator.next();
            String gphone = (String) map.get(key);
            key = iterator.next();
            Integer oid = (Integer) map.get(key);
            key = iterator.next();
            String gname = (String) map.get(key);
            %>
<%=oid+"  "%>
<%=glocation+"  "%>
<%=gphone+"  "%>
<%=gname+"  "%><br>
<%
        }
    }
%>


</body>
</html>
