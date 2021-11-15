<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: artur
  Date: 24.01.2021
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${not empty role ? role : "guest"}
<br><br>
<c:choose>
    <c:when test="${not empty role}">
        ${role}
    </c:when>
    <c:otherwise>
        guest
    </c:otherwise>
</c:choose>
</body>
</html>