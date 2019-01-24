<%@page import="com.psg.ramasubramani.Counter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int numberOfHits = 0; %>
printing using instance variable : 
<%= ++numberOfHits %>
</br>
Doubling the instance variable : 
<%! int doubleCount()
{
	return 2*numberOfHits;
}
%>
<%=
doubleCount()
%>
</br>
<% int count = com.psg.ramasubramani.Counter.getCount(); %> 
Number of hits of using non-expression syntax : 
<% out.println(count);
out.println();
%>
</br>
Number of hits using expression :
<%= count  %>
</body>
</html>