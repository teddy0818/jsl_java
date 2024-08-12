<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	
	String name = request.getParameter("name");
	String userid = request.getParameter("userid");
	String pass = request.getParameter("pass");
	String repass = request.getParameter("repass");
	String gender = request.getParameter("gender");
	String phone = request.getParameter("phone1") + "-" + 
					request.getParameter("phone1") + "-" + 
					request.getParameter("phone1");
	String email = request.getParameter("email1") + "@" + 
			request.getParameter("email2"); 
	String job = request.getParameter("job");
	String fa = request.getParameter("fa");
	String intro = request.getParameter("intro");

	
	out.print("이름 : " + name + "<br>");
	out.print("아이디 : " + userid + "<br>");
	out.print("비번 : " + pass + "<br>");
	out.print("비번확인 : " + repass + "<br>");
	out.print("성별 : " + gender + "<br>");
	out.print("전화 : " + phone + "<br>");
	out.print("이메일 : " + email + "<br>");
	out.print("직업 : " + job + "<br>");
	out.print("관심분야 : " + fa + "<br>");
	out.print("기타 : " + intro + "<br>");



%>
    
    