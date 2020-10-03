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
<form action="saveUser" method="POST">
    姓名：<input type="text" name="name"/></br>
    密码：<input type="text" name="password"/></br>
    金额：<input type="text" name="price"/></br>
    <input type="submit" value="提交"/></br>
</form>
</body>
</html>
