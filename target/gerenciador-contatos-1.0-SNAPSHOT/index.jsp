<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:url value="/login" var="linkToLogin" />
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
    rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <title>Document</title>
</head>
<body>
    <div class="container">
        <form action="${linkToLogin}" method="post">
            <div class="form-group">
                <label for="mail">Email:</label>
                <input type="email" class="form-control" id="mail" name="email">
                <label for="pwd">Password: </label>
                <input type="password" class="form-control" id="pwd" name="password">
                <button type="submit">Login</button>
            </div>
        </form>
        <button type="submit" ><a href="${pageContext.request.contextPath}/userForm.jsp">Registrar</a></button>

    </div>
</body>
</html>