<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="m" class="com.model.SignupModel"/>
<jsp:setProperty property="*" name="m"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>


	<%
			String pass = request.getParameter("password");
			String repass = request.getParameter("repassword");
			//String email=request.getParameter("email");
			  String email=request.getParameter("val");  
			    if(email==null||email.trim().equals(""))
			    {  
			    	out.print("<p>Please enter Email!</p>");  
			    }
			    else if(pass!=null)
			    {
					if(pass.equals(repass)){
						
					int status = UserDao.savedata(m);
					
					if(status>0)
					{
						//out.print("Success");
						response.sendRedirect("index.jsp");
					}
					else
					{
						out.print("Fail");
					}
					}
				}
				/* else if(pass != repass)
				{
					out.print("Password and repassword are not same");
				} */
	
			    else
			    {  
			    	try
			    	{  
			    		Class.forName("com.mysql.jdbc.Driver");
			    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webwing","root","");  
			    		PreparedStatement ps=con.prepareStatement("select * from signup where email=?");  
			    		ps.setString(1, email);
			    		ResultSet rs=ps.executeQuery();  
			      		if(rs.next()) 
			      		{      
			     			out.println("<p>Email Id Already Used</p>");   
			    		}
			      		else
			      		{  
			    			out.println("<p>This Email Id Is Available</p>"); 
			    		}  
			    		con.close();  
			    	}
			    	catch(Exception e)
			    	{
			    		out.print(e);
			    	}  
			    }  
			    		
			
	
	%>

</body>
</html>