<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/21/2022
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h3>The spice condiments are selected as:  </h3>

<c:forEach var="spice" items="${spice}">
    <p>${spice}</p>
</c:forEach>

</body>
</html>
