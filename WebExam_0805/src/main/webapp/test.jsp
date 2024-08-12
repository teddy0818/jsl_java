<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "java.util.*" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>asd</title>
</head>
<body>
	<%
		List<String> list = new ArrayList();
		list.add("1000,박사원,M,901010,300");
		list.add("1001,김사원,M,901010,300");
		
		for(int i=0; i<list.size(); i++) {
			String[] arr = list.get(i).split(",");
			String name = arr[1];
	%>
			<%= name %>
	<%
		}
	
	%>
	
	
</body>
</html>