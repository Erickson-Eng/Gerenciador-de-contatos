<%--
  Created by IntelliJ IDEA.
  User: Erickson
  Date: 10/09/2021
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:url value="/NewAddress" var="linkToNewAddressServlet"/>
<html>
<head>
    <title>State Form</title>
</head>
<body>
<form action="${linkToNewAddressServlet}" method="post">
    street: <input type="text" name="street">
    number: <input type="text" name="number">
    complement: <input type="text" name="complement">
    district: <input type="text" name="district">
    cep: <input type="text" name="cep">
    city: <input type="text" name="city">
    state: <input type="text" name="state">
    <input type="submit">
</form>
</body>
</html>
