
<%@page import="com.Model.www.Model"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>employee</title>
</head>
<body>
<h1>employee details</h1>

<table border="1"> 
<tr>
<th>Name</th>
<th>Age</th>
</tr>
<c:forEach var="m" items="${rohan1}">
<tr>
<td>${m.name}</td>
<td>${m.age}</td>
</tr>
</c:forEach>
</table> 
</body>
</html>