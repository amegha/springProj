<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> ${issueTicketDTO.name} Successfully issued a ticket of type ${issueTicketDTO.issueType}</h1>
<a href="IssueTicket.jsp">click here issue new ticket</a>
<a href="/IssueTicket.jsp">click here issue new ticket with /</a>
</body>
</html>