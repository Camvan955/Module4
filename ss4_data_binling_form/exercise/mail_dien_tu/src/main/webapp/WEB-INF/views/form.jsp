<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/22/2022
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Cấu hình thư điện tử</title>
</head>
<body>
<h1>Settings</h1>

<form:form action="/add" method="post" modelAttribute="email">

    <form:label path="languages">Languages: </form:label>
    <form:select path="languages" items="${languages}"/><br><br>
    <form:label path="pageSize">Page Size: </form:label>
    <form:select path="pageSize" items="${pageSize}"/><br><br>
    <form:label path="spamsFillter">Spams fillter: </form:label>
    <form:checkbox path="spamsFillter"/><br><br>
    <form:label path="signature">Signature: </form:label>
    <form:textarea path="signature"></form:textarea><br><br>
    <input type="submit" value="Update">
    <input type="submit" value="Cancel">
</form:form>
</body>
</html>
