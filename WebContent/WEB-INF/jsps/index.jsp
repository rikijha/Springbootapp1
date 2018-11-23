<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>All Products </h1>
<c:forEach items="${list }" var="product">
      <h2>Name:  <c:out value="${product.getName() }"/></h2><br>
      Price:   <c:out value="${product.getPrice() }"/><br>
       Description:  <c:out value="${product.getDescription() }"/>
       <hr>
</c:forEach>
<a href="${pageContext.request.contextPath }/vendor-registration">Vendor Registration</a>
<br><br>
<a href="${pageContext.request.contextPath }/add-product">Add Product</a>
</body>
</html>