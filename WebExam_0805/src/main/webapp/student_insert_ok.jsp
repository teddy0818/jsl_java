<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <% %>

<%
	request.setCharacterEncoding("utf-8");

	String grade = request.getParameter("grade");
	String className = request.getParameter("class");
	String num = request.getParameter("num");
	String birth = request.getParameter("birth");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String phone = request.getParameter("phone1") + "-" + 
					request.getParameter("phone2") + "-" + 
					request.getParameter("phone3");
	
	// 입력받은 데이터 출력
	out.print("학년 : " + grade + "<br>");
	out.print("반 : " + className + "<br>");
	out.print("번호 : " + num + "<br>");
	out.print("생년월일 : " + birth + "<br>");
	out.print("이름 : " + name + "<br>");
	out.print("성별 : " + gender + "<br>");
	out.print("연락처 : " + phone + "<br>");


%>
    
    