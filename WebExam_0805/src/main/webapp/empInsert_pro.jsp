<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, java.util.*" %>    

<%
	//한글 인코딩
	request.setCharacterEncoding("utf-8");
	//데이터 받기
	int eno = Integer.parseInt(request.getParameter("eno"));
	String ename = request.getParameter("ename");
	String job = request.getParameter("job");
	int manager = Integer.parseInt(request.getParameter("manager"));
	String hiredate = request.getParameter("hiredate");
	int salary = Integer.parseInt(request.getParameter("salary"));
	int commission = Integer.parseInt(request.getParameter("commission"));
	int dno = Integer.parseInt(request.getParameter("dno"));
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	//ResultSet rs = null;
	
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521";
		String user = "scott";
		String password = "tiger";
		conn = DriverManager.getConnection(url, user, password);
	}catch(Exception e){
		e.printStackTrace();
	}

	int row = 0;
	String sql="insert into emp(eno,ename,job,manager,hiredate,salary,commission,dno) " + 
			 " values(?,?,?,?,?,?,?,?)";
	
	pstmt = conn.prepareStatement(sql);
	pstmt.setInt(1, eno);
	pstmt.setString(2, ename);
	pstmt.setString(3, job);
	pstmt.setInt(4, manager);
	pstmt.setString(5, hiredate);
	pstmt.setInt(6, salary);
	pstmt.setInt(7, commission);
	pstmt.setInt(8, dno);

	row = pstmt.executeUpdate();
%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		if(row==1){
	%>
	<h3>등록되었습니다</h3>
	
	<%
		}else{
	%>
	<h3>등록실패</h3>
	
	<%
		}
	%>
	<h3><a href="index.jsp">홈으로</a></h3>
</body>
</html>