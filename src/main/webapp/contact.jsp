<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <title>Document</title>
</head>

<body>
    <div class="container">
        <h2>Lista de endereços cadastrados</h2>
        <a href="/gerenciador/newContact.jsp?userId=${user.id}">Adicionar</a>
        <c:forEach items="${responses}" var="response">
            <li>
                    ${response.nome} - ${response.rg} - ${response.cpf}
            </li>
        </c:forEach>
    </div>
</body>

</html>