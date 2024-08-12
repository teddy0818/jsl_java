<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table { width:500px; border:1px solid #222;	margin:0 auto}
	td { border:1px solid #222; padding : 5px;}
</style>
<script>
	function send(){
		//이름 입력 유무 체크
		if(joinForm.name.value==""){
			alert("이름을 입력하세요");
			joinForm.name.focus();//커서이동
			return;
		}
		//아이디 입력 체크
		
		//비번, 리비번 체크

		//비번,리비번 같은지 체크
		if(joinForm.pass.value==joinForm.repass.value){
			
		}
		//라디오 버튼 체크
		if(!joinForm.gender[0].checked && 
						!joinForm.gender[1].checked){
			alert("성별을 선태하세요");
			return;
		}
		
		//checkbox 체크
		
		
	}

</script>
</head>
<body>
	<h1 align="center">회원 가입 페이지</h1>
	<form name="joinForm" method="post" action="exam_03_ok.jsp">
	<table>
		<tr>
			<td colspan="2" align="center">회원 기본 정보</td>
		</tr>
		<tr>
			<td>사용자이름</td>
			<td><input type="text" name="name" id="name"></td>
		</tr>
		<tr>
			<td>사용자아이디</td>
			<td><input type="text" name="userid" id="userid"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="pass" id="pass"></td>
		</tr>
		<tr>
			<td>비밀번호확인</td>
			<td><input type="password" name="repass" id="repass"></td>
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
				<select name="phone1">
					<option value="010">010</option>
					<option value="02">02</option>
					<option value="031">031</option>
					<option value="032">032</option>
					<option value="042">042</option>
					<option value="052">052</option>
				</select> - 
				<input type="text" name="phone2" size="4"> - 
				<input type="text" name="phone3" size="4">
			</td>
		</tr>
		<tr>
			<td>이메일</td>
			<td>
				<input type="text" name="email1" size="10">@
				<input type="text" name="email2" size="10">
				<select name="emailchk">
					<option>직접입력</option>
					<option value="naver.com">naver.com</option>
					<option value="nate.com">nate.com</option>
					<option value="google.com">google.com</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>직업</td>
			<td>
				<select name="job">
					<option>직업을 선택하세요</option>
					<option value="영업">영업</option>
					<option value="공무원">공무원</option>
					<option value="회사원">회사원</option>
					<option value="교.강사">교.강사</option>
					<option value="학생">학생</option>
					<option value="기타">기타</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>관심분야</td>
			<td>
				<input type="checkbox" name="fa" value="골프">골프
			    <input type="checkbox" name="fa" value="축구">축구
			    <input type="checkbox" name="fa" value="야구">야구
			    <input type="checkbox" name="fa" value="농구">농구
			    <input type="checkbox" name="fa" value="배구">배구
			</td>
		</tr>
		<tr>
			<td>기타(한마디)</td>
			<td>
				<textarea name="intro" cols="40" rows="5"></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="가입하기1" >&nbsp;&nbsp;
				<input type="button" value="가입하기2" onClick="send()">&nbsp;&nbsp;
				<input type="reset" value="다시쓰기"> &nbsp;&nbsp;
				<input type="button" value="돌아가기">
			</td>
		</tr>		
	</table>
	</form>

</body>
</html>