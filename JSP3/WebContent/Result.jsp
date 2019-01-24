<%@page import="com.subex.ramasubramani.Qualification"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bean example</title>
</head>
<body>
The limitation here is get or set property can be a string or a primitive and you cannot have object as your property.
<br>
	<jsp:useBean id="Qualification"
		class="com.subex.ramasubramani.Qualification"
		type="com.subex.ramasubramani.Qualification" scope="request">
		<jsp:setProperty property="qualification" name="Qualification"
			value="BE" />
	</jsp:useBean>
	This qualification property is set by JSP : 
	<%=( ( Qualification ) request.getAttribute( "Qualification" ) ).getQualification()%>
	<br>
	This employee property is set by Servlet :
	<jsp:useBean id="Employee" class="com.subex.ramasubramani.Employee"
		type="com.subex.ramasubramani.Employee" scope="request" />
	<jsp:getProperty property="name" name="Employee" />
</body>
</html>