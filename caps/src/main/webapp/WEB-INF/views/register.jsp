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
<title>Register</title>
</head>
<body>
<a href="index">Home</a>
<c:if test="${empty loggedInUser}">
<a href="login">Login</a>
</c:if>
<c:if test="${not empty loggedInUser}">
<a href="logout">Logout</a>
</c:if>
<%-- <h1>${msg}</h1>
<h2>${success}</h2>
<h2>First Name:${users.lname}</h2> --%>
<form:form action="register" modelAttribute="user" method="post">
<label>Email</label><br>
<form:input path="email" placeholder="Email"/>
<label>Password</label><br>
<form:input path="password" placeholder="Password"/>
<label>Password Again</label><br>
<form:input path="pass2" placeholder="Password Again"/>
<label>First Name</label><br>
<form:input path="lname" placeholder="Last Name"/>
<label>Last Name</label><br>
<form:input path="fname" placeholder="First Name"/>
<label>Phone</label><br>
<form:input path="phone" placeholder="Phone"/>
<button type="submit">Submit</button>
</form:form>
</body>
</html>