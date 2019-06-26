<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="pal.TestPalindrome"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%! String str = "kayak"; %>
<%! TestPalindrome pal = new TestPalindrome(); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World</title>
</head>
<body>
      <%
         out.println("the word in question is: " + str);
      %>
	<BR>
      <% if (pal.isPalindrome(str)) { %>
         <% out.println(str + " is a Palindrome!"); %>
      <% } else { %>
         <p> Its not a Palindrome</p>
      <% } %>

	
</body>
</html>
