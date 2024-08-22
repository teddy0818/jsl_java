<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
</head>
<body>
	<h2>회원 목록</h2>
	<table border="1" width="800">
		<tr>
			<th>회원번호</th>
			<th>회원성명</th>
			<th>전화번호</th>
			<th>성별</th>
			<th>가입일자</th>
			<th>고객등급</th>
			<th>도시명</th>
		</tr>
		<%
			// 데이터베이스 연결 및 조회
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				// 데이터베이스 연결
				Class.forName("oracle.jdbc.OracleDriver");
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "scott";
				String password = "tiger";
				conn = DriverManager.getConnection(url, user, password);
				
				// SQL 쿼리 작성 및 실행
				String sql = "SELECT m.custno, m.custname, m.phone, m.gender, m.joindate, m.grade, c.city, c.cityname " +
							 "FROM tbl_member m " +
							 "JOIN tbl_city c ON m.city = c.city";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				// 결과 출력
				while(rs.next()) {
					int custno = rs.getInt("custno");
					String custname = rs.getString("custname");
					String phone = rs.getString("phone");
					String gender = rs.getString("gender");
					String joindate = rs.getString("joindate");
					String grade = rs.getString("grade");
					String city = rs.getString("city");
					String cityname = rs.getString("cityname");
					
					// 등급에 따른 표시
					String gradeDisplay = "";
					if("A".equals(grade)) {
						gradeDisplay = "VIP";
					} else if("B".equals(grade)) {
						gradeDisplay = "일반";
					} else if("C".equals(grade)) {
						gradeDisplay = "직원";
					}
		%>
		<tr>
			<td><%= custno %></td>
			<td><%= custname %></td>
			<td><%= phone %></td>
			<td><%= gender.equals("M") ? "남자" : "여자" %></td>
			<td><%= joindate %></td>
			<td><%= gradeDisplay %></td>
			<td><%= cityname %></td>
		</tr>
		<%
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				// 자원 해제
				if(rs != null) try { rs.close(); } catch(Exception e) {}
				if(pstmt != null) try { pstmt.close(); } catch(Exception e) {}
				if(conn != null) try { conn.close(); } catch(Exception e) {}
			}
		%>
	</table>
</body>
</html>
