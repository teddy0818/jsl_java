<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.board.model.*" %>

<%
	request.setCharacterEncoding("utf-8");
	
	BoardDAO dao = BoardDAO.getInstance();
	BoardDTO dto = new BoardDTO();
	
	//dto.setName(request.getParameter("name"));
	dto.setIdx(Integer.parseInt(request.getParameter("idx")));
	dto.setEmail(request.getParameter("email"));
	dto.setSubject(request.getParameter("subject"));
	dto.setContents(request.getParameter("contents"));
	dto.setPass(request.getParameter("pass"));
	//테스트
	//out.print(dto.getName());
	
	int row = dao.boardModify(dto);
	if(row==1){
		response.sendRedirect("board_list.jsp");
	}else{
%>
	<script>
		alert("비번오류 등록실패");
		history.back();
	</script>
    
<%
	}
%>    