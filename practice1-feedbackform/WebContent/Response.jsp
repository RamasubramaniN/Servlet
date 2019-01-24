<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Feedback Response</title>
</head>
<body>
	<h3>Thanks for your feedback.</h3>
	<br> User Name :
	<%=request.getAttribute( "userName" )%><br> Password :
	<%=request.getAttribute( "password" )%><br> Country :
	<%=request.getAttribute( "country" )%><br> Rating :
	<%=request.getAttribute( "siteRating" )%><br> Comments :
	<%=request.getAttribute( "comments" )%><br>
</body>
</html>