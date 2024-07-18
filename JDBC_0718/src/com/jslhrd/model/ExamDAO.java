package com.jslhrd.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ExamDAO {
	private static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = 
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		
		return conn;				
	}
	
	//메소드 작성
	//EQUI 조인을 사용하여 SCOTT 사원의 사원번호, 이름, 부서번호, 부서이름을 출력
	public List<ExamDTO> exam_01(String ename){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//쿼리
		String sql="select eno,ename,emp.dno,dname from emp, dept\r\n"
				+ "            where emp.dno=dept.dno and emp.ename=?";
		//반환타입
		List<ExamDTO> list = new ArrayList();
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ename);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ExamDTO dto = new ExamDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setDno(rs.getInt("dno"));
				dto.setDname(rs.getString("dname"));
				
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
