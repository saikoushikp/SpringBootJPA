<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="getAlien">
	Id:<input type = "text" name="aid">
	<br> <br>
	<input type="submit" value="Get Alien">
	</form>
	 <br> 
	 
	 <form action="showAll" method="post">
	 <input type="submit" value="Show All">
	 </form>
	 <br> 
	${alien }
	${count }
</body>
</html>