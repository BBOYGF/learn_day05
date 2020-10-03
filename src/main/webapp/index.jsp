<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-10-03
  Time: 0:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>入门程序</h3>
<a href="hello">入门程序</a>
<a href="test/demo?name=guowen">入门程序</a>
<%--<form action="saveUser" method="POST">--%>
<%--    姓名：<input type="text" name="name"/></br>--%>
<%--    密码：<input type="text" name="password"/></br>--%>
<%--    金额：<input type="text" name="price"/></br>--%>
<%--    用户姓名：<input type="text" name="list[0].name"/></br>--%>
<%--    用户年龄：<input type="text" name="list[0].age"/></br>--%>
<%--    用户姓名：<input type="text" name="map['第一'].name"/></br>--%>
<%--    用户年龄：<input type="text" name="map['第一'].age"/></br>--%>
<%--    <input type="submit" value="提交"/></br>--%>
<%--</form>--%>

<form action="saveUser" method="post">
    用户姓名：<input type="text" name="name"/></br>
    用户密码：<input type="text" name="password"/></br>
    用户生日：<input type="text" name="date"/> </br>
   <input type="submit" value="提交"/>
</form>
<a href="testServlet">获取原生servlet的API</a></br>
<a href="requsetParam?name='郭文'">参数和方法变量不匹配</a></br>
<a href="requestCookieValue">requestCookieValue</a></br>
<a href="testSessionAttributes">testSessionAttributes</a></br>
</body>
</html>
