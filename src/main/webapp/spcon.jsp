    
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="pal.ConvertSpoonerism"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%! ConvertSpoonerism spoon = new ConvertSpoonerism(); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spoonerism Converter</title>
	<h1>Enter two words to be converted into a spoonerism</h1>
  
 </head>
 <body>
 <form method= "get">
  Word1:<br>
   <input type="text" name="word1" value="">
  <br>
  Word2:<br>
   <input type="text" name="word2" value="">
  <br><br>
  <input type="submit" name="submit" value="convert">
</form> 
  <%
  String[] str1 = request.getParameterValues("word");
  String[] str2 = request.getParameterValues("word");
  if (str1 != null && str2 != null) {
  String spoonerism = spoon.convert(str1[0],str2[0]);
  %>
  
  <% out.println("the spoonerism is: " + spoonerism); %>
  		<BR>
		<a href="<%= request.getRequestURI() %>">BACK</a>
		<BR>
  <%
  }
  %>
  <a href="index.jsp">Return to Home?</a>
 </body>
</html>
