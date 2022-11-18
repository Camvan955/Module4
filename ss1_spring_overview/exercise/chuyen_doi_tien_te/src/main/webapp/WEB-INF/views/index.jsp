<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/18/2022
  Time: 3:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency</title>
</head>
<body>
<h1>Currency Convert</h1>
<form action="/change" , method="post">
    <input type="text" name="usd" placeholder="Enter your number need change">

    <input type="submit" value="Result">
</form>

<p> Result:${rs} VND</p>
</body>
</html>
