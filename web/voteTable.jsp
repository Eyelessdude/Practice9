<%--
  Created by IntelliJ IDEA.
  User: bohdan
  Date: 2/21/19
  Time: 9:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Vote table</title>
</head>
<body>
<form>
    <table border="1">
        <c:forEach var="entry" items="${applicationScope.map}">
            <tr>
                <td>${entry.key}</td>
                <td>${entry.value}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="vote">Back to vote</a>
</form>
</body>
</html>
