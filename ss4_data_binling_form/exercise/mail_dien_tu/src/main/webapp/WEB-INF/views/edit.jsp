<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/22/2022
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Kết Quả</h3>
<h4>Languages: ${email.getLanguages()}</h4>
<h4>Page Size: ${email.getPageSize()}</h4>
<span>Spam Filter: <c:if test="${email.isSpamsFillter()==true}">
    <span>Spam Filter</span>
</c:if></span>
<h4>Signature: ${email.getSignature()}</h4>
</body>
</html>
