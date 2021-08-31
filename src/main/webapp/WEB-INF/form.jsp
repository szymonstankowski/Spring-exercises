<%--
  Created by IntelliJ IDEA.
  User: szymon
  Date: 31.08.2021
  Time: 23:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Form</title>
</head>
<body>
<form action="/add-hero" method="post">
    Name:
    <input type="text" name="heroName">
    Power:
    <input type="number" name="heroPower">
    <input type="submit">
</form>

</body>
</html>
