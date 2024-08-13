<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    

<%
    // 한글 인코딩 설정
    request.setCharacterEncoding("utf-8");

    // 폼에서 데이터 받기
    String custname = request.getParameter("mname");
    String phone1 = request.getParameter("phone1");
    String phone2 = request.getParameter("phone2");
    String phone3 = request.getParameter("phone3");
    String phone = phone1 + "-" + phone2 + "-" + phone3;  // 전체 전화번호
    String gender = request.getParameter("gender");
    String joindate = request.getParameter("date");
    String grade = request.getParameter("grade");
    String cityCode = request.getParameter("cityCode");
    System.out.println("cityCode : " + cityCode);
    System.out.println("mno : " + request.getParameter("mno"));
    int custno = Integer.parseInt(request.getParameter("mno"));

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        // JDBC 드라이버 로드
        Class.forName("oracle.jdbc.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:xe";  // 데이터베이스 연결 URL
        String user = "scott";  // DB 사용자 이름
        String password = "tiger";  // DB 비밀번호
        conn = DriverManager.getConnection(url, user, password);  // DB 연결

        // SQL 문 작성
        String sql = "INSERT INTO tbl_member(custno, custname, phone, gender, joindate, grade, city) " +
                     "VALUES(?, ?, ?, ?, ?, ?, ?)";
        
        // PreparedStatement 생성 및 데이터 바인딩
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, custno);
        pstmt.setString(2, custname);
        pstmt.setString(3, phone);
        pstmt.setString(4, gender);
        pstmt.setString(5, joindate);
        pstmt.setString(6, grade);
        pstmt.setString(7, cityCode);

        // SQL 실행
        int row = pstmt.executeUpdate();  // 실행 결과로 삽입된 행 수 반환

        // 결과 출력
        if (row == 1) {
            out.println("<h3>회원 등록이 성공적으로 완료되었습니다.</h3>");
        } else {
            out.println("<h3>회원 등록에 실패했습니다.</h3>");
        }
    } catch (Exception e) {
        e.printStackTrace();
        out.println("<h3>오류가 발생했습니다: " + e.getMessage() + "</h3>");
    } finally {
        // 자원 해제
        if (pstmt != null) try { pstmt.close(); } catch (Exception e) { }
        if (conn != null) try { conn.close(); } catch (Exception e) { }
    }
%>
<h3><a href="index.jsp">홈으로</a></h3>