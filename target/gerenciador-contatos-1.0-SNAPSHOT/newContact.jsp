<%--
  Created by IntelliJ IDEA.
  User: Erickson
  Date: 10/09/2021
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:url value="/newContact" var="linkToNewAddressServlet"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${linkToNewAddressServlet}" method="post">
    name: <input type="text" name="name">
    rg: <input type="text" name="rg">
    cpf: <input type="text" name="cpf">
    <input type="submit">
</form>

</body>
</html>
