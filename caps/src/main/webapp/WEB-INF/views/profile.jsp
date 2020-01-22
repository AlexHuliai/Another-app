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
<title>User Profile</title>
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
<p>${loggedInUser.lname}</p>
<p>${loggedInUser.phone}</p>
</body>
</html>