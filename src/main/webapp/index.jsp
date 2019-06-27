<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="pal.TestPalindrome"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%! TestPalindrome pal = new TestPalindrome(); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World</title>
</head>
<body>
<form action="/action_page.php">
  First name:<br>
   <input type="text" name="word" value="">
  <br><br>
  <input type="submit" value="Submit">
</form> 
  <%
  String str = request.getParameterValues("word");
  if (str != null) {
  %>
      <%
         out.println("the word in question is: " + str);
      %>
	<BR>
      <% if (pal.isPalindrome(str)) { %>
         <% out.println(str + " is a Palindrome!"); %>
      <% } else { %>
         <% out.println(str + " is not a Palindrome"); %>
      <% } %>
<%>
}
<%>

	
</body>
</html>
