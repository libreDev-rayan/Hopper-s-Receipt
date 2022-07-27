<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	
<h1>Customer Name : <c:out value ="${names}"></c:out></h1>
<p><c:out value ="${itemNames}"></c:out><p>
<p><c:out value ="${prices}"></c:out><p>
<p><c:out value ="${descriptions}"></c:out><p>
<p><c:out value ="${vendors}"></c:out><p>

</body>
</html>