<%--
  Created by IntelliJ IDEA.
  User: jaro
  Date: 16.11.2021
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/mvc13" method="post">

    <input type="text" name="title" placeholder="title"> <br>
    <input type="text" name="author" placeholder="author"> <br>
    <input type="text" name="isbn" placeholder="isbn"> <br>
    <button type="submit" >PUSH</button> <br>
</form>

${not empty message ? message : ""}
</body>
</html>
