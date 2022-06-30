<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateAlien">
Alien Id: <input type="text" value=<%= request.getParameter("aid") %> name="aid"  readOnly>
Alien Name: <input type="text" name="aname">
<input type="submit" value="Update">
</form>
</body>
</html>