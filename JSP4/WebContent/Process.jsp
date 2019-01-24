<%@page import="com.subex.ramasubramani.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Process Form</title>
</head>
<body>
<jsp:useBean id="employee" type="com.subex.ramasubramani.Employee" class="com.subex.ramasubramani.Employee" scope="request">
<jsp:setProperty property="name" param="name" name="employee"/>
<jsp:setProperty property="age" param="age" name="employee"/>
<jsp:setProperty property="empId" param="empId" name="employee"/>
<jsp:setProperty property="position" param="position" name="employee"/>
</jsp:useBean>
Printing using Employee Object : <br>
Employee Name : <%=employee.getName()%> <br>
Employee Id   : <%=employee.getEmpId()%> <br>
Employee Age  : <%=employee.getAge()%> <br>
Position      : <%=employee.getPosition()%> <br>
<br>
<br>
Printing using Request Object : <br>
Employee Name : <%=((Employee)request.getAttribute("employee")).getName()%> <br>
Employee Id   : <%=((Employee)request.getAttribute("employee")).getEmpId()%> <br>
Employee Age  : <%=((Employee)request.getAttribute("employee")).getAge()%> <br>
Position      : <%=((Employee)request.getAttribute("employee")).getPosition()%> <br>
</body>
</html>