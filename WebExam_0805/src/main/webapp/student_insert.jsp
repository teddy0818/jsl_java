<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 등록 페이지</title>
<style>
	table {
	 width:500px;
	 border:1px solid #222;
	 margin:0 auto;
	 border-collapse: collapse;
	 }
	td { 
	border:1px solid #222; 
	padding : 5px;
	}
	#tableName {
		font-size:20px;
		font-weight:bolder;
		padding: 5px;
	}
	
</style>
<script>
	function send(){
		//학년 입력 유무 체크
		if(studentRegForm.grade.value==""){
			alert("학년 정보가 입력되지 않았습니다.");
			studentRegForm.grade.focus();
			return;
		}

		// 반 입력 유무 체크
		if(studentRegForm.class.value==""){
			alert("반 정보가 입력되지 않았습니다.");
			studentRegForm.class.focus();
			return;
		}

		// 번호 입력 유무 체크
		if(studentRegForm.num.value==""){
			alert("번호가 입력되지 않았습니다.");
			studentRegForm.num.focus();
			return;
		}

		// 생년월일 입력 유무 체크
		if(studentRegForm.birth.value==""){
			alert("생년월일이 입력되지 않았습니다.");
			studentRegForm.birth.focus();
			return;
		}

		// 이름 입력 유무 체크
		if(studentRegForm.name.value==""){
			alert("이름이 입력되지 않았습니다.");
			studentRegForm.name.focus();
			return;
		}

		// 성별 선택 유무 체크
		if(!studentRegForm.gender[0].checked && !studentRegForm.gender[1].checked){
			alert("성별이 선택되지 않았습니다.");
			return;
		}

		// 연락처 입력 유무 체크
		if(studentRegForm.phone1.value=="" || studentRegForm.phone2.value=="" || studentRegForm.phone3.value==""){
			alert("연락처가 완전히 입력되지 않았습니다.");
			return;
		}

		// 폼 제출
		studentRegForm.submit();
	}

</script>
</head>
<body>
	<form name="studentRegForm" method="post" action="student_insert_ok.jsp">
	<table>
		<tr>
			<td colspan="2" align="center" id="tableName">학생 등록</td>
		</tr>
		<tr>
			<td>학년</td>
			<td><input type="text" name="grade" id="grade"></td>
		</tr>
		<tr>
			<td>반</td>
			<td><input type="text" name="class" id="class"></td>
		</tr>
		<tr>
			<td>번호</td>
			<td><input type="text" name="num" id="num"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name" id="name"></td>
		</tr>
		<tr>
			<td>생년월일</td>
			<td><input type="text" name="birth" id="birth"></td>
		</tr>
		<tr>
			<td>성별</td>
			<td>
				<input type="radio" name="gender" value="M">남자
			    <input type="radio" name="gender" value="F">여자
			</td>
		</tr>
		<tr>
			<td>연락처</td>
			<td>
				<input type="text" name="phone1" size="3"> -
				<input type="text" name="phone2" size="4"> - 
				<input type="text" name="phone3" size="4">
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="button" value="학생등록" onClick="send()">&nbsp;&nbsp;
				<input type="reset" value="다시쓰기"> &nbsp;&nbsp;
			</td>
		</tr>
	</table>
	</form>

</body>
</html>