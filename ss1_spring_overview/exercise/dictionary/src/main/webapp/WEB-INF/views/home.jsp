<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/18/2022
  Time: 4:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tra từ điển</title>
</head>
<h1>Ứng dựng tra từ điển</h1>
<form action=""  method="post">
    <input type="text" name="text" placeholder="Enter your text need translate">

    <input type="submit" value="Result">
</form>

<p> Kết quả:${map.get(text)} </p>
</body>
</html>
