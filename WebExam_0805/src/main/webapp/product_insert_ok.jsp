<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	request.setCharacterEncoding("utf-8");

	String inOutNum = request.getParameter("inOutNum");
	String productCode = request.getParameter("productCode");
	String inOutType = request.getParameter("gender");
	String count = request.getParameter("count");
	String date = request.getParameter("date");
	String company = request.getParameter("company");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>입출고 정보</title>
    <style>
       
        table {
            width: 50%;
            border-collapse: collapse;
            margin: 20px auto;
        }
        th, td {
            border: 1px solid #000;
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        .button-cell {
            text-align: center;
        }
        .button {
            padding: 10px 20px;
            margin: 10px;
            font-size: 16px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <table>
        <tr>
            <th>항목</th>
            <th>내용</th>
        </tr>
        <tr>
            <td>입출고번호</td>
            <td><%= inOutNum %></td>
        </tr>
        <tr>
            <td>제품코드</td>
            <td><%= productCode %></td>
        </tr>
        <tr>
            <td>입출고구분</td>
            <td><%= inOutType %></td>
        </tr>
        <tr>
            <td>수량</td>
            <td><%= count %></td>
        </tr>
        <tr>
            <td>거래일자</td>
            <td><%= date %></td>
        </tr>
        <tr>
            <td>거래처</td>
            <td><%= company %></td>
        </tr>
        <tr>
            <td colspan="2" class="button-cell">
                <button class="button" onclick="history.back();">돌아가기</button>
                <button class="button" onclick="location.href='index.jsp';">홈으로</button>
            </td>
        </tr>
    </table>
</body>
</html>
