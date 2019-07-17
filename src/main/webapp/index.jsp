<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="pal.TestPalindrome"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%! TestPalindrome pal = new TestPalindrome(); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Palindrome Check</title>
	<h1>Enter a word to see if its a palindrome (same forwards or backwards)</h1> 
</head>
<body>
<form method= "get">
  Word:<br>
   <input type="text" name="word" value="">
  <br><br>
  <input type="submit" name="submit" value="check">
</form> 
  <%
  String[] str = request.getParameterValues("word");
  if (str != null) {
  %>
      <%
         out.println("the word in question is: " + str[0]);
      %>
	<BR>
      <% if (pal.isPalindrome(str[0])) { %>
         <% out.println(str[0] + " is a Palindrome!"); %>
      <% } else { %>
         <% out.println(str[0] + " is not a Palindrome"); %>
      <% } %>
		<BR>
		<a href="<%= request.getRequestURI() %>">BACK</a>
		<BR>
<%
}
%>
	<a href="spcon.jsp">convert to spoonerism?</a>
			<p> poll scm test </p>
				
		
	
</body>
</html>
