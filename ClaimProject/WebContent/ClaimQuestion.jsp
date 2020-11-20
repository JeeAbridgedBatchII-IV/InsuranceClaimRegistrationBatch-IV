<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.insurance.claim.utils.DatabaseConnection" %>
		<%@page import="com.insurance.claim.dao.ClaimDBQueries" %>

<!DOCTYPE html>
<html>
<head>
<link rel = "stylesheet" type = "text/css" href = "Style1.css" />
</head>
<body>
	<h1> CLAIM FAQS</h1>
	<form action="ClaimQuestion">
		<table border="1px" cellpadding="2" cellspacing="2"
			class="table table-dark table-hover">
			<%
				String policy_type;
					Long policyNo1 = Long.parseLong(request.getParameter("policyn"));
					try {
						Connection con = DatabaseConnection.getConnection();
						PreparedStatement ps = con.prepareStatement(ClaimDBQueries.policyType);
						Long policyNo = Long.parseLong(request.getParameter("policyn"));
						ps.setLong(1, policyNo);
						ResultSet rs = ps.executeQuery();
						rs.next();
						policy_type = rs.getString(2);

						PreparedStatement ps1 = con.prepareStatement(ClaimDBQueries.question);
						ps1.setString(1, policy_type);
						ResultSet rs1 = ps1.executeQuery();
						int i = 1;
			%>
					
					<tr>
					<th>QUES_ID</th>
					<th> Policy Type</th>
					<th>QUESTION</th>
					<th>ANSWER</th>
					</tr>
					
				<% 
					while (rs1.next()) {
						String name = rs1.getString(1);
			%>
			<tr>
				<td><%=rs1.getString(1)%></td>
				<td><%=rs1.getString(2)%></td>
				<td><%=rs1.getString(3)%></td>
				<td><input type="radio" name=<%=name%> value="yes">Yes<br>
					<input type="radio" name=<%=name%> value="No">No<br></td>
			</tr>


			<%
				i++;
					}

					con.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				ServletContext cText = getServletContext();
				cText.setAttribute("policyNo1",policyNo1);
				
			/* 	request.setAttribute("policyNo1", String.valueOf(policyNo1)); */
				System.out.println("JSP page no: "+policyNo1);
			%>
		</table>
		<br>
		<br>
		<button>Proceed</button>
	</form>

</body>
</html>
