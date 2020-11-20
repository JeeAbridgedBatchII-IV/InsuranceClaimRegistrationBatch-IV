<%@page import="java.sql.DriverManager,java.sql.ResultSet,java.sql.Statement,java.sql.Connection,com.insurance.claim.utils.DatabaseConnection"%>

		<!DOCTYPE html>
		<html>
			<head>
			<link rel = "stylesheet" type = "text/css" href = "Style1.css" />
			</head>
		<body>
		<h1>Report</h1>
		<table border="1px" cellpadding="2" cellspacing="2" class="table table-dark table-hover">
		<%
		try{
            Connection connection = DatabaseConnection.getConnection();
			Statement statement = connection.createStatement();
			String sql ="SELECT * FROM policy";
			ResultSet resultSet = statement.executeQuery(sql);
			%>
			
			<tr>
			<th>POLICY_NUMBER</th>
			<th> POLICY_TYPE</th>
			<th>POLICY_PREMIUM</th>
			<th>ACCOUNT_NUMBER</th>
			</tr>
			
		<% 
		while(resultSet.next())
		{
		%>
			<tr>
			<td><%=resultSet.getInt(1) %></td>
			<td><%=resultSet.getString(2)%></td>
			<td><%=resultSet.getInt(3)%></td>
			<td><%=resultSet.getInt(4)%></td>
			</tr>
		<%
		}
			
		connection.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		
		%>
		</table><br><br>
		
		<form action="report1.jsp">
		<label for="policy1"><b>Policy Number</b></label>
    	<input type="text" placeholder="Enter Policy Number" name="policy1"><br />
    	<button>Generate Report</button>
    	</form>	
    
		</body>
		</html>		