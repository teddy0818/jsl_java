<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 다중 import -->
<%@ page import="java.sql.*, java.util.*" %>
<% 
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	try{
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521";
		String user = "scott";
		String password = "tiger";
		conn = DriverManager.getConnection(url, user, password);
	}catch(Exception e) {
		e.printStackTrace();
	}

	int row = 0;
	String sql = "select count(*) as counter from emp";
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery();
	if(rs.next()){
		row = rs.getInt("counter");
	}
%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>DB 연결 테스트</h1>
	<h3>커넥션 : <%= conn %></h3>
	<h3>사원수 : <%= row %> 명</h3>
</body>
</html>
