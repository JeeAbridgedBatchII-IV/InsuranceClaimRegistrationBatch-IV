<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.sql.DriverManager"%>
		<%@page import="java.sql.ResultSet"%>
		<%@page import="java.sql.PreparedStatement"%>
		<%@page import="java.sql.Connection"%>
		<%@page import="com.insurance.claim.utils.DatabaseConnection" %>
		<%@page import="com.insurance.claim.dao.ClaimDBQueries" %>
		
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel = "stylesheet" type = "text/css" href = "Style1.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px" cellpadding="2" cellspacing="2" class="table table-dark table-hover">
		<%
			try{
		            Connection connection = DatabaseConnection.getConnection();
		            PreparedStatement statement =connection.prepareStatement(ClaimDBQueries.reportGeneration);
		            Long policy=Long.parseLong(request.getParameter("policy1"));
		            statement.setLong(1, policy);
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
		%>
			<table>
			<tr><td><%=resultSet.getString(1) %></td></tr>
			<tr><td><%=resultSet.getString(2)%></td></tr>
			
			<tr><td><%=resultSet.getString(3)%></td> </tr>
			<tr><td><%=resultSet.getString(4)%></td></tr>
			<tr><td><%=resultSet.getString(5) %></td></tr>
			<tr><td><%=resultSet.getString(6)%></td></tr>
			<tr><td><%=resultSet.getString(7)%></td></tr>
			<tr><td><%=resultSet.getString(8)%></td></tr>
			<tr><td><%=resultSet.getString(9)%></td>
			</tr>
			
			<% 
		while(resultSet.next()){
			%>
			<tr>
			<td><%=resultSet.getString(8)%></td></tr>
			<tr><td><%=resultSet.getString(9)%></td>
			</tr>
			
			<%
		}
			
		connection.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
		%>
		</table>
</body>
</html>