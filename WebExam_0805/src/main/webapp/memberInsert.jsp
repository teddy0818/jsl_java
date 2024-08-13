<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function validateForm() {
	var mno = document.frm.mno.value;
	var mname = document.frm.mname.value;
	var phone1 = document.frm.phone1.value;
	var phone2 = document.frm.phone2.value;
	var phone3 = document.frm.phone3.value;
	var date = document.frm.date.value;

	if (mno == "") {
		alert("회원번호를 입력하세요.");
		document.frm.mno.focus();
		return false;
	}
	if (mname == "") {
		alert("회원성명을 입력하세요.");
		document.frm.mname.focus();
		return false;
	}
	if (phone1 == "" || phone2 == "" || phone3 == "") {
		alert("전화번호를 입력하세요.");
		return false;
	}
	if (isNaN(phone1) || isNaN(phone2) || isNaN(phone3)) {
		alert("전화번호는 숫자로 입력하세요.");
		return false;
	}
	if (date == "") {
		alert("가입일자를 입력하세요.");
		document.frm.date.focus();
		return false;
	}

	return true;
}

function send() {
	if (validateForm()) {
		alert("회원을 등록합니다");
		frm.action = "memberInsert_pro.jsp";
		frm.submit();
	}
}

function cancel() {
	alert("등록을 취소합니다");
	history.back();
}

</script>
</head>
<body>
	<form name="frm" method="post" >
		<table border=1 width=300>
			<tr>
				<th colspan=2>회원등록</th>
			</tr>
			<tr>
				<th>회원번호</th>
				<td><input type="text" name="mno"></td>
			</tr>
			<tr>
				<th>회원성명</th>
				<td><input type="text" name="mname"></td>
			</tr>
			<tr>
			<td>회원전화</td>
				<td>
					<input type="text" name="phone1" size="3"> -
					<input type="text" name="phone2" size="4"> - 
					<input type="text" name="phone3" size="4">
				</td>
			</tr>
			<tr>
				<td>성별</td>
				<td>
					<input type="radio" name="gender" value="M">남자
				    <input type="radio" name="gender" value="F">여자
				</td>
			</tr>
			<tr>
				<td>가입일자</td>
				<td><input type="text" name="date" id="date"></td>
			</tr>
			<tr>
				<td>고객등급</td>
				<td>
					<select name="grade">
						<option value="A">VIP</option>
						<option value="B">일반</option>
						<option value="C">직원</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>도시코드</td>
				<td>
					<select name="cityCode">
						<%
							// JDBC 코드 작성
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
								
								// SQL 쿼리 실행
								String sql = "SELECT city, cityname FROM tbl_city";
								pstmt = conn.prepareStatement(sql);
								rs = pstmt.executeQuery();
								
								// ResultSet으로부터 데이터 가져와서 <option> 태그 생성
								while(rs.next()) {
									String cityCode = rs.getString("city");
									String cityName = rs.getString("cityname");
									out.print("<option value='" + cityCode + "'>" + cityName + "</option>");
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
					</select>
				</td>
			</tr>
			<tr>
				<td colspan=2 align=center>
					<input type="button" value="등록하기" onClick="send()"> &nbsp;
					<input type="button" value="다시쓰기" onClick="cancle()">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
