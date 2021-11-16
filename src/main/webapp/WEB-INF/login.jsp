<%--
  Created by IntelliJ IDEA.
  User: jaro
  Date: 24.01.2021
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="/login" method="post">
    <input type="text"  name="username"/>
    <input name="password" type="password"/>
    <button type="submit">Zaloguj</button> <br>
</form>

${not empty message ? message : ""}
</body>
</html>
