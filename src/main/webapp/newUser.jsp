<%--
  Created by IntelliJ IDEA.
  User: Erickson
  Date: 10/09/2021
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:url value="/newUser" var="linkToNewUserServlet" />
<html>

<head>
  <title>Form new user</title>
</head>

<body>
  <form action="${linkToNewUserServlet}" method="post">
    Username: <input type="text" name="Username">
    Password: <input type="password" name="Password">
    Email: <input type="email" name="Email">
    <input type="submit">
  </form>

</body>

</html>