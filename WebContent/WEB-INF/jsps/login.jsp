<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login</h1>
<c:if test="${param.status != null }">
  <font color="red">Invalid username/password</font>
</c:if>

<form action="${pageContext.request.contextPath }/login" method="post">
     Username:<input type="text" name="username"><br>
     Password:<input type="password" name="password"><br>
     <input type="submit" value="login" name="submit">
</form>
</body>
</html>