<%--
  Created by IntelliJ IDEA.
  User: leiqjl
  Date: 2018/6/24
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/>">
</head>
<body>
    <h1>Welcome to Spittr主页</h1>
    <a href="<c:url value="/spittles"/>">Spittles</a>|
    <a href="<c:url value="/spitter/register"/>">Register</a>
</body>
</html>
