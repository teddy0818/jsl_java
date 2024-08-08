<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<style>
	table {
		border: 1px black solid;
		border-collapse:  collapse;
		margin: 0 auto;
	}
	td {
		border: 1px black solid;
		border-collapse:  collapse;
		height: 30px;
	}
	#tableName {
		background-color: yellow;
		font-weight: 800;
	}
</style>
<body>
	<table>
		<tr align="center" id="tableName">
			<td colspan="2">회원 기본 정보</td>
		<tr>
		<tr>
			<td>사용자이름</td>
			<td><input type="text"></td>
		<tr>
		<tr>
			<td>사용자아이디</td>
			<td><input type="text"></td>
		<tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="text"></td>
		<tr>
		<tr>
			<td>비밀번호확인</td>
			<td><input type="text"></td>
		<tr>
		<tr>
			<td>성별</td>
			<td>
					<input type="radio" /> 남자 
					<input type="radio" /> 여자 
			</td>
		<tr>
		<tr>
			<td>연락처</td>
			<td>
				<select>
				<option>010</option>
				</select>
				-
				<input type="text">
				-
				<input type="text">
			</td>
		<tr>
		<tr>	
			<td>이메일</td>
			<td>
			<input type="text">@<input type="text">
			<select>
				<option>직접 입력</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>직업</td>
			<td>
				<select>
						<option>직업을 선택하세요</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>
				관심분야 
			</td>
			<td>
				<input type="checkbox" /> 골프	
				<input type="checkbox" /> 축구 
				<input type="checkbox" /> 야구 
				<input type="checkbox" /> 농구 
				<input type="checkbox" /> 배구
			</td>
		</tr>
		<tr>
			<td>기타(한마디)</td>
			<td><textarea></textarea></td>
		</tr>
		<tr align="center">
			<td colspan="2">
				<button>가입하기</button>
				<button>돌아가기</button>
			</td>
		</tr>
	</table>
	
</body>
</html>