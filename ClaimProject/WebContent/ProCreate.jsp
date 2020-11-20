<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" type = "text/css" href = "Style1.css" />
</head>
<body>
<h1>New Profile Creation:</h1>
	<form method="post" action="ProCreate">
		  <div class="container">
    <label for="uname"><b>UserName</b></label>
    <input type="text" placeholder="Enter Username" name="username" pattern="[A-Z]{1}[a-zA-Z0-9]{3,19}", title="First letter must be capital and length should be greater than 4" required><br />

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" pattern="[A-Z]{1}[a-zA-z0-9@$%*#_-]{6,11}", title="First letter must be capital and length should be greater than 6"  name="password" required><br />

    <label for="role"><b>Role</b></label>
	 &nbsp;&nbsp;&emsp;&emsp;<input type="radio" name="role" value="CLAIM_HANDLER">CLAIM_HANDLER<br>
  	&emsp;&emsp;&emsp;&emsp;&emsp;<input type="radio" name="role" value="CLAIM_ADJUSTER">CLAIM_ADJUSTER<br>
  	&emsp;&emsp;&emsp;&emsp;&emsp;<input type="radio" name="role" value="INSURED">INSURED<br>  
        
    <button type="submit">Login</button>
  </div> 
	</form>
</body>
</html>