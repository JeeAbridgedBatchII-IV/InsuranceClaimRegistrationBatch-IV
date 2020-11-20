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
		<h1>POLICY</h1>
		<table border="1px" cellpadding="2" cellspacing="2" class="table table-dark table-hover">
		<%
			List<Long> list=new ArrayList<Long>();
				try{
			ServletContext cText = getServletContext();
			long policyNo = (long) cText.getAttribute("policyNo");
		            Connection connection = DatabaseConnection.getConnection();
		            PreparedStatement ps = connection.prepareStatement(ClaimDBQueries.insuredpolicy);
		            ps.setLong(1, policyNo);
		            ResultSet resultSet = ps.executeQuery();
		%>
			
			<tr>
			<th>POLICY_NUMBER</th>
			<th> POLICY_TYPE</th>
			<th>POLICY_PREMIUM</th>
			<th>ACCOUNT_NUMBER</th>
			</tr>
			
		<% 
			
		while(resultSet.next()){
			list.add(Long.parseLong(resultSet.getString(1)));
			%>
			<tr>
			<td><%=resultSet.getString(1) %></td>
			<td><%=resultSet.getString(2)%></td>
			<td><%=resultSet.getString(3)%></td>
			<td><%=resultSet.getString(4)%></td>
			</tr>
			<br>
			<%
			
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