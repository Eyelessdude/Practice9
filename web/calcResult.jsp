<%--
  Created by IntelliJ IDEA.
  User: bohdan
  Date: 2/21/19
  Time: 7:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
 <%= request.getAttribute("result")%><br>
<a href="calculate">Back to calculate form</a>
</body>
</html>
