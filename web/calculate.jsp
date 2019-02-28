<%--
  Created by IntelliJ IDEA.
  User: bohdan
  Date: 2/21/19
  Time: 7:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculate</title>
</head>
<body>
<form name="calc_form" action="calculate" method="post">
    <label>First value</label><br>
    <input name="firstValue"><br>
    <label>Second value</label><br>
    <input name="secondValue"><br>
    <label>Operation</label><br>
    <select name="operation">
        <option value="plus" selected>+</option>
        <option value="minus">-</option>
    </select>
    <br>
    <br>
    <input type="submit">
</form>
</body>
</html>
