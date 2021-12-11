<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
  <title><fmt:message key="title"/></title>
    <style><%@include file="/WEB-INF/views/cssIndex.css"%></style>
</head>
<body class="body">
<h1><fmt:message key="priceincrease.heading"/></h1>
<form:form method="post" modelAttribute="priceIncrease">
  <table >
    <tr>
      <td align="right" width="20%"><label for="incremento">Incremento (%):</label></td>
        <td width="20%">
          <form:input path="percentage" id="incremento"/>
        </td>
        <td width="60%">
          <form:errors path="percentage" cssClass="error"/>
        </td>
    </tr>
  </table>
  <br>
  <br>
  <br>
  <input class="btnenviar" type="submit" value="Aumentar precio">
</form:form>

<br>
<br>
<br>
<br>

<a class="btninicio" href="<c:url value="hello.htm"/>">Inicio</a>
</body>
</html>