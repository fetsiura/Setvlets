<%--
  Created by IntelliJ IDEA.
  User: jaro
  Date: 14.11.2021
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


${empty cookie.foo.value ? "nie ma takiego": cookie.foo.value}
</body>
</html>
