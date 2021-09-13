<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:url value="/newContact" var="linkToNewContact" />
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

        <a href="/gerenciador/contact?userId=${user}">Adicionar</a>

        <form action="${linkToNewContact}" method="post">
            <div>
                <h2>Contato</h2>
                <div class="form-group">
                    <label for="usr">Nome:</label>
                    <input type="text" class="form-control" id="usr" name="name">
                </div>
                <div class="form-group">
                    <label for="rg">RG:</label>
                    <input type="text" class="form-control" id="rg" name="rg">
                </div>
                <div class="form-group">
                    <label for="cpf">CPF: </label>
                    <input type="text" class="form-control" id="cpf" name="cpf">
                </div>
            </div>
            <div>
                <h2>Endereço</h2>
                <div class="form-group">
                    <label for="rua">Rua:</label>
                    <input type="text" class="form-control" id="rua" name="street">
                </div>
                <div class="form-group">
                    <label for="numero">Numero:</label>
                    <input type="text" class="form-control" id="numero" name="number">
                </div>
                <div class="form-group">
                    <label for="complemento">Complemento:</label>
                    <input type="text" class="form-control" id="complemento" name="complement">
                </div>
                <div class="form-group">
                    <label for="bairro">Bairro:</label>
                    <input type="text" class="form-control" id="bairro" name="district">
                </div>
                <div class="form-group">
                    <label for="cep">Cep:</label>
                    <input type="text" class="form-control" id="cep" name="cep">
                </div>
                <div class="form-group">
                    <label for="cidade">Cidade:</label>
                    <input type="text" class="form-control" id="cidade" name="city">
                </div>
                <div class="form-group">
                    <label for="estado">Estado:</label>
                    <input type="text" class="form-control" id="estado" name="state">
                </div>
                <div>
                    <input type="hidden" name="user" value="${user.id}">
                    <button type="submit">Registrar</button>
                </div>
            </div>
        </form>
    </div>
</body>

</html>