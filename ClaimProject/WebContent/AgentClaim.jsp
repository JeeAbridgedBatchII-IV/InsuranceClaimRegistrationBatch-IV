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
		<h1>ALL CLAIMS</h1>
		<table border="1px" cellpadding="2" cellspacing="2" class="table table-dark table-hover">
		<%
			List<Long> list=new ArrayList<Long>();
				try{
			ServletContext cText = getServletContext();
			String username = (String) cText.getAttribute("username");
		            Connection connection = DatabaseConnection.getConnection();
		            PreparedStatement ps = connection.prepareStatement(ClaimDBQueries.agentaccounts1);
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
			<td><%=resultSet.getString(4)%></td>
			</tr>
			
			<%
			list.add(Long.parseLong(resultSet.getString(4)));
			
		}
			
		connection.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
		ServletContext cText = getServletContext();
		cText.setAttribute("list",list);
		%>
		</table><br><br>
		<form action="ClaimCheck" method="post">
  		<div class="container">
    	<label for="uname"><b>Policy Number</b></label>
    	<input type="text" placeholder="Enter Policy number" name="policy12"  required><br />
    	&nbsp;&nbsp;&emsp;&emsp;&emsp;<button type="submit">Proceed</button>
  		</div>
	</form>
		
		</body>
		</html>