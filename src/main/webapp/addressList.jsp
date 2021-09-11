<%--
  Created by IntelliJ IDEA.
  User: Erickson
  Date: 11/09/2021
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Contact address</title>
</head>

<body>
    <h1> Contact address list </h1>
    <ul>
        <c:forEach items="${addressList}" var="address">
            <li>
                    ${address.street}
            </li>
        </c:forEach>
    </ul>

</body>

</html>