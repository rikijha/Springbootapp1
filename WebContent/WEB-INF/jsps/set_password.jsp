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
<h1>Registration Success</h1>
<h3>Set Login Credentials</h3>
Name: <c:out value="${name }"/><br><br>
City : <c:out value="${city }"/><br><br>
</body>
</html>