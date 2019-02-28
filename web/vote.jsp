<%--
  Created by IntelliJ IDEA.
  User: bohdan
  Date: 2/21/19
  Time: 8:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Sport vote</title>
</head>
<body>
<form action="vote" method="post">
    <select name="sport">
        <c:forEach var="entry" items="${applicationScope.map}">
            <option value="${entry.key}">${entry.key}</option>
        </c:forEach>
    </select>
    <input type="submit">
</form>
</body>
</html>
