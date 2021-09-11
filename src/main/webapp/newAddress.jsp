
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
<c:url value="/NewAddress" var="linkToNewAddressServlet" />
<html>

<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
  <title>State Form</title>
</head>

<body>
  <div class="jumbotron jumbotron-fluid">
    <div class="container">
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
    </div>
  </div>

</body>
<footer>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"
    integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN"
    crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js"
    integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/"
    crossorigin="anonymous"></script>
</footer>

</html>