<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/21/2022
  Time: 2:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
    <style>
        .mg{
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
<h1>Calculator</h1>
<form action="result", method="post">
    <span class="mg"><input type="text" name="number_one" value="${number_one}"></span>
    <span class="mg"><input type="text" name="number_two" value="${number_two}"></span>
    <br><br>
    <span><input type="submit" name="calculus" value="addition"></span>
    <span><input type="submit" name="calculus" value="subtraction"></span>
    <span><input type="submit" name="calculus" value="multiplication"></span>
    <span><input type="submit" name="calculus" value="division"></span>
</form>

<span>Result: ${result}</span>

</body>
</html>
