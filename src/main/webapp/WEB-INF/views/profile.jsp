<%--
  Created by IntelliJ IDEA.
  User: leiqjl
  Date: 2018/6/28
  Time: 0:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
</head>
<body>
    <h1>Your Profile</h1>
    <c:out value="${spitter.username}"/><<br/>
    <c:out value="${spitter.firstName}"/><<br/>
    <c:out value="${spitter.lastName}"/>
</body>
</html>
