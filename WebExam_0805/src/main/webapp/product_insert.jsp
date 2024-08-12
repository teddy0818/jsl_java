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
	if(productRegForm.inOutNum.value == ""){
		alert("입출고번호가 입력되지 않았습니다.");
		productRegForm.inOutNum.focus();
		return;
	}

	if(productRegForm.productCode.value == ""){
		alert("제품코드가 입력되지 않았습니다.");
		productRegForm.productCode.focus();
		return;
	}

	if(!productRegForm.gender[0].checked && !productRegForm.gender[1].checked){
		alert("입출고구분이 선택되지 않았습니다.");
		return;
	}

	if(productRegForm.count.value == ""){
		alert("수량이 입력되지 않았습니다.");
		productRegForm.count.focus();
		return;
	}

	if(productRegForm.date.value == ""){
		alert("거래일자가 입력되지 않았습니다.");
		productRegForm.date.focus();
		return;
	}

	if(productRegForm.company.value == "거래처명"){
		alert("거래처가 선택되지 않았습니다.");
		productRegForm.company.focus();
		return;
	}

	productRegForm.submit();
}

</script>
</head>
<body>
	<form name="productRegForm" method="post" action="product_insert_ok.jsp">
	<table>
		<tr>
			<td colspan="2" align="center" id="tableName">입출고 등록</td>
		</tr>
		<tr>
			<td>입출고번호</td>
			<td><input type="text" name="inOutNum" id="inOutNum"></td>
		</tr>
		<tr>
			<td>제품코드</td>
			<td><input type="text" name="productCode" id="productCode"></td>
		</tr>
		<tr>
			<td>입출고구분</td>
			<td>
				<input type="radio" name="gender" value="입고">입고
			    <input type="radio" name="gender" value="출고">출고
			</td>
		</tr>
		<tr>
			<td>수량</td>
			<td><input type="text" name="count" id="count"></td>
		</tr>
		<tr>
			<td>거래일자</td>
			<td><input type="text" name="date" id="date"></td>
		</tr>
		<tr>
			<td>거래처</td>
			<td>
				<select name="company">
					<option>거래처명</option>
					<option value="서울공장(10)">서울공장(10)</option>
					<option value="울산공장(20)">울산공장(20)</option>
					<option value="부산상사(30)">부산상사(30)</option>
				</select>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="button" value="입출고등록" onClick="send()">&nbsp;&nbsp;
				<input type="reset" value="다시쓰기"> &nbsp;&nbsp;
			</td>
		</tr>
	</table>
	</form>

</body>
</html>