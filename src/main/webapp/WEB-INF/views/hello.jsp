<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
  <head>
  <title><fmt:message key="title"/></title>
  <style><%@include file="/WEB-INF/views/cssIndex.css"%></style>
  </head>
  
  <body class="body">
  <div class="cabecera">
  	<h1><fmt:message key="heading"/></h1>
  </div>
    <p><fmt:message key="greeting"/> <c:out value="${model.now}"/></p>
    <h3>Productos en el inventario</h3>
    <c:forEach items="${model.products}" var="prod">
      <c:out value="${prod.description}"/> <a class="prices"><i>$<c:out value="${prod.price}"/></i></a><br><br>
    </c:forEach>
     <br>
   <div>
    <a class="btnincrease" href="<c:url value="priceincrease.htm"/>">Incrementar precios</a>
   </div>
   
  	<br>
  	<br>
  	<br>
  	<br>
  	
   <div>
   <a class="btnincrease" href="<c:url value="addproduct.htm"/>">Agregar nuevo producto</a>
   </div>
   
   
  </body>
  
</html>