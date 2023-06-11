<%@page import="com.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="m" class="com.model.contactmodel"/>
<jsp:setProperty property="*" name="m"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<%
			int status=UserDao.contactdata(m);
		
		if (status>0)
		{
			//out.print("success");
			response.sendRedirect("index.jsp");
			
		}
		else{
			out.print("fail");
		}

		%>

</body>
</html>