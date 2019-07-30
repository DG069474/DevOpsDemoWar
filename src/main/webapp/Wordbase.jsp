<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="pal.WebDBManager"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%! WebDBManager manager = new WebDBManager("dvdrental"); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WordBank</title>
	<h1>WordBank Output</h1> 
</head>
<body>
<%
 ArrayList list =  manager.basicQueryReturn();
 for(int i = 0; i< list.size(); i++){
 	out.println(list.get(i)+ "<BR>");
 }
 out.println(list.get(0));
%>

					
				
		
	
</body>
</html>
