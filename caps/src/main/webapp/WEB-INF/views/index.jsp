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
<a href="/capstone/about">About us</a>
<a href="/capstone/index">Home</a>
<a href="/capstone/services">Services</a>
<a href="/capstone/register">Register</a>
<a href="name?id=Huliai">My name</a>
<a href="getname-Oleksandr">My name2</a>
<h1>${msg}</h1>
<h2>${success}</h2>

<table class="table table-striped">
              <thead>
                <tr>
                  <th>#</th>
                  <th>Name</th>
                  <th>Email</th>
                  <th>Phone</th>                  
                </tr>
              </thead>
              <tbody>
                <c:forEach var="item" items="${users}" >
                <tr>
                  <td>
                    ${users.indexOf(item)+1}.
                  </td>                   
                  <td>
                    ${item.fname} ${item.lname}
                  </td>
                  <td>
                    ${item.email}
                  </td>
                  <td>
                    ${item.phone}
                  </td>
                  
                  
                </tr>
                </c:forEach>
                
              </tbody>
            </table>




<%-- <form action="login" method="post">
<input type="text" name="fname" placeholder="put something here">
<input type="text" name="lname" placeholder="put something here">
<button type="submit">Submit</button>
</form> --%>
</body>
</html>