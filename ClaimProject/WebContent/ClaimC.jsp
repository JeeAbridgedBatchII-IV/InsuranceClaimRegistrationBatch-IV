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
<form action="ClaimCreate" method="post">
  <div class="container">
  <label for="policyn"><b>Policy Number</b></label>
    <input type="text" placeholder="Enter Policy number" name="policyn"  required><br />
    <label for="reason"><b>Claim Reason</b></label>
    <input type="text" placeholder="Enter claim reason" name="reason"  required><br />
    <label for="location"><b>Claim Location</b></label>
    <input type="text" placeholder="Enter claim Location" name="location"  required><br />
    <label for="city"><b>Claim City</b></label>
    <input type="text" placeholder="Enter claim City" name="city"  required><br />
    <label for="state"><b>Claim State</b></label>
    <input type="text" placeholder="Enter claim state" name="state"  required><br />
    <label for="zip"><b>ZipCode</b></label>
    <input type="text" placeholder="Enter claim zipcode" name="zip"  required><br />
    <label for="ctype"><b>Claim Type</b></label>
    <input type="text" placeholder="Enter claim type" name="ctype"  required><br />
    &nbsp;&nbsp;&emsp;&emsp;&emsp;<button type="submit">Proceed</button>
  </div>
</form>
</body>
</html>