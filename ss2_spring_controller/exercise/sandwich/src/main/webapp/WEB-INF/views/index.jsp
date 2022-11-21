<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/21/2022
  Time: 1:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Sandwich Condiments</title>
</head>
<body>

<h1>Sandwich Condiments</h1>
<form action="/save" method="post">
    <span><input type="checkbox" id="lettuce" name="spice" value="Lettuce">Lettuce</span>
    <input type="checkbox" id="tomato" name="spice" value="Tomato">Tomato
    <input type="checkbox" id="mustard" name="spice" value="Mustard">Mustard
    <input type="checkbox" id="sprouts" name="spice" value="Sprouts">Sprouts
    <hr>
<input type="submit" id="save" value="Save">
</form>
</body>
</html>
