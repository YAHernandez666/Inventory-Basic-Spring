<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
  <title><fmt:message key="title"/></title>
  <style>
    .error { color: red; }
  </style>  
</head>
<body>
<h1><fmt:message key="addproduct.heading"/></h1>

<form:form method="post" modelAttribute="addProduct">
  <table >
    <tr>
      <td align="right" width="20%">Descripcion del product:</td>
        <td width="20%">
          <form:input path="nameProduct"/>
        </td>
        <td width="60%">
          <form:errors path="nameProduct" cssClass="error"/>
        </td>
    </tr>
  </table>
  
  <table>
  	<tr>
  		 <td align="right" width="20%">Precio del producto:</td>
         <td width="20%">
          <form:input path="priceProduct"/>
        </td>
        <td width="60%">
          <form:errors path="priceProduct" cssClass="error"/>
        </td>
  	</tr>
  </table>
  
  <br>
  <input type="submit" value="Execute">
</form:form>


<a href="<c:url value="hello.htm"/>">Inicio</a>
</body>
</html>