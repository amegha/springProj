<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Help desk welcome page</h1>
	<form name="issueTicketForm" action="issueTicket" method="post">
		<pre>
Name: <input type="text" name="name" />
Mobile:<input type="text" name="mobile" />
Product:<select name="product">
<option value="select">SELECT</option>
<option value="tv">TV</option>
<option value="Fridge">FRIDGE</option>
<option value="tv">TV</option>
</select>
Issue Type:<select name="issueType">
<option value="select">SELECT</option>
<option value="replacement">REPLACE</option>
<option value="not working">NOT WORKING</option>
<option value="anual service">SERVICE</option>
</select>

Description: <textarea rows="4" cols="5" name="description"></textarea>
<input type="submit" value="SUBMIT" />

</pre>
	</form>
</body>
</html>