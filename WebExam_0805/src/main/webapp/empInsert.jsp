<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function send(){
		alert("사원을 등록합니다");
		//유효성검사 생략
		frm.action="empInsert_pro.jsp"
		frm.submit();
	}
	
	function cancle(){
		alert("등록을 취소합니다");
		history.back();
	}

</script>
</head>
<body>
	<form name="frm" method="post" >
		<table border=1 width=300>
			<tr>
				<th colspan=2>사원등록</th>
			</tr>
			<tr>
				<th>사원번호</th>
				<td><input type="text" name="eno"></td>
			</tr>
			<tr>
				<th>사원이름</th>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<th>업무명</th>
				<td><input type="text" name="job"></td>
			</tr>
			<tr>
				<th>상사번호</th>
				<td><input type="text" name="manager"></td>
			</tr>
			<tr>
				<th>입사일자</th>
				<td><input type="text" name="hiredate"></td>
			</tr>
			<tr>
				<th>급여</th>
				<td><input type="text" name="salary"></td>
			</tr>
			<tr>
				<th>커미션</th>
				<td><input type="text" name="commission"></td>
			</tr>
			<tr>
				<th>부서번호</th>
				<td><input type="text" name="dno"></td>
			</tr>
			<tr>
				<td colspan=2 align=center>
					<input type="button" value="등록" onClick="send()"> &nbsp;
					<input type="button" value="취소" onClick="cancle()">
				</td>
			</tr>
		</table>
	
	</form>
</body>
</html>