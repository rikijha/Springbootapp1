<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sv"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Vendor Registration</h1>
<sv:form action="${pageContext.request.contextPath }/vendor-register" method="post" commandName="vendor">
    Name:<sv:input type="text" name="name" path="name" /><sv:errors path="name"/><br><br>
    City:<sv:input type="text" name="city" path="city" /><sv:errors path="city"/><br><br>
    <input type="submit" value="Register">
    
</sv:form>
</body>
</html>