<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
  <c:when test="${empty loggedInUser}">
  <a href="login">Login</a>
  <a href="register">Register</a>
  </c:when>
  <c:otherwise>
  <a href="logout">Logout</a>
  </c:otherwise>
  </c:choose>
<a href="index">Home</a>
<h1>${msg} ${error}</h1>
<form action="login" method="post">
<input type="text" name="email" placeholder="Username"></input>
<input type="password" name="password" placeholder="Password"></input>
<button type="Submit">Log In</button>
</form>
</body>
</html>