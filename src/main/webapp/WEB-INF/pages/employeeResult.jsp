<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC From Handling</title>
</head>
<body> <h2>Employee Entry Result</h2>
    <table>
        <tr>
            <td>First Name</td>
            <td>${e.firstName}</td>
        </tr>
        <tr>
            <td>Last name</td>
            <td>${e.lastName}</td>
        </tr>
           <tr> 
            <td>Job Title</td>
            <td>${e.jobTitle}</td>
        </tr>
        <tr>
            <td>Full Time</td>
            <td>${e.fullTime}</td>
        </tr>
        </table>
<a href = "viewAll.mvc">View all Employees</a>
</body>
</html>