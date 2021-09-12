<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.example.gerenciadorcontatos.model.entities.Address" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Erickson
  Date: 11/09/2021
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<ul>
    <c:forEach items="${lista}" var="address">
        <li>
                ${address.street} - ${address.district} - ${address.state}
        </li>
    </c:forEach>
</ul>

</body>
</html>
