<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Second JSP</title>
</head>
<body>
	welcome
	<jsp:useBean id="attribute1" type="com.subex.ramasubramani.Person"
		class="com.subex.ramasubramani.Person" scope="request"></jsp:useBean>
	<jsp:getProperty property="fullname" name="attribute1" />
</body>
</html>