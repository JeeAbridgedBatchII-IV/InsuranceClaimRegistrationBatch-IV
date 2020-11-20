<%@page import="java.sql.DriverManager"%>
		<%@page import="java.sql.ResultSet"%>
		<%@page import="java.sql.Statement"%>
		<%@page import="java.sql.Connection"%>
		<%@page import="java.util.ArrayList"%>
		<%@page import="java.util.List"%>	
		<%@page import="java.sql.PreparedStatement"%>		
		<%@page import="com.insurance.claim.utils.DatabaseConnection" %>
		<%@page import="com.insurance.claim.dao.ClaimDBQueries" %>
		<!DOCTYPE html>
		<html>
			<head>
<link rel = "stylesheet" type = "text/css" href = "Style1.css" />
			</head>
		<body>
		<h1>ALL ACCOUNTS</h1>
		<table border="1px" cellpadding="2" cellspacing="2" class="table table-dark table-hover">
		<%
			try{
			ServletContext cText = getServletContext();
			String username = (String) cText.getAttribute("username");
		            Connection connection = DatabaseConnection.getConnection();
		            PreparedStatement ps = connection.prepareStatement(ClaimDBQueries.agentaccounts);
		            ps.setString(1,username);
		            ResultSet resultSet = ps.executeQuery();
		%>
			
			<tr>
			<th>ACCOUNT_NUMBER</th>
			<th>INSURED_NAME</th>
			<th> AGENT NAME</th>
			<th> POLICY NUMBER</th>
			</tr>
			
		<% 
			
		while(resultSet.next()){
			%>
			<tr>
			<td><%=resultSet.getString(1) %></td>
			<td><%=resultSet.getString(2)%></td>
			<td><%=resultSet.getString(3)%></td>
			</tr>
			<%
			
		}
			
		connection.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		%>
		</table><br><br>
	
		
		</body>
		</html>