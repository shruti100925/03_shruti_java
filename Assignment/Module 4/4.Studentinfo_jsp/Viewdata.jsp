<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
	String name=request.getParameter("fname");
    String fname=request.getParameter("lname");
    String email=request.getParameter("email");
    String mobile=request.getParameter("mobile");
    String gender=request.getParameter("gender");
    String pass=request.getParameter("pass");
    
    

	out.print("Your Firstname:"+name);
	%><br>
	<%
	out.print("Your Lastname:"+fname);
	%>
	<br>
	<%
	out.print("Your Email id:"+email);
	%>
	<br>
	<%
	out.print("Your Mobile no:"+mobile);
	%>
	<br>
	<%
	out.print("Your Gender:"+gender);
	%>
	<br>
	<%
	out.print("Your Password:"+pass);
	%>
	




</body>
</html>