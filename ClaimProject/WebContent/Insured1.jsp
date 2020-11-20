<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.vertical-menu {
  width: 200px;
}

.vertical-menu a {
  background-color: #eee;
  color: black;
  display: block;
  padding: 12px;
  text-decoration: none;
}

.vertical-menu a:hover {
  background-color: #ccc;
}

.vertical-menu a.active {
  background-color: #4CAF50;
  color: white;
}
</style>
</head>
<body>
<h1>Hi </h1>

<div class="vertical-menu">
  <a href="#" class="active">INSURED</a><br />
  <a href="InsuredClaim" target="admin2">Claim Creation</a><br />
  <a href="InsuredView" target="admin2">View Claim</a><br />
<a href="Login.jsp" target="_top">Logout</a>
</div>

</body>
</html>