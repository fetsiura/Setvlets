<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jaro
  Date: 16.11.2021
  Time: 18:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${books}" var="book" varStatus="count">

       ${count.count}. Tytuł "${book.title}",Autor "${book.author}",Isbn "${book.isbn}" <br>
    </c:forEach>


</body>
</html>
