package com.jslhrd.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	private static Connection getConnection() throws Exception{
		//드라이버 로딩
		Class.forName("oracle.jdbc.OracleDriver");
		//커넥션 생성
		Connection conn = 
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
		return conn;
	}
	//메소드 작성
	public void dbTest() {
		Connection conn = null;
		try {
			conn = getConnection();
			System.out.println("커넥션 : " + conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//[1] 사원수 구하기
	public int getCount() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//반환타입
		int row=0;
		//query
		String sql="select count(*) as counter from emp";
		
		try {
			conn = getConnection();//케넥션 
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				row = rs.getInt("counter");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return row;
	}

	//[2] 부서수 구하기
	public int getDnoCount() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//반환타입
		int row=0;
		//query
		String sql="select count(distinct dno) as counter from emp";
		
		try {
			conn = getConnection();//케넥션 
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				row = rs.getInt("counter");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return row;
	}
	//[3] 부서별 사원수 구하기
	public List<EmpDTO> getDnoList(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//반환타입
		List<EmpDTO> list = new ArrayList();
		//쿼리
		String sql = "select dno, count(*) as counter "
				+               " from emp group by dno order by dno";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setDno(rs.getInt("dno"));
				dto.setCounter(rs.getInt("counter"));
				
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	//[4] 특정급여이상 사원 검색 
	public List<EmpDTO> getSalaryList(int salary){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//반환타입
		List<EmpDTO> list = new ArrayList();
		//쿼리
		String sql = "select eno,ename,hiredate, salary "
				+ 		" from emp where salary >= ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, salary);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setHiredate(rs.getString("hiredate"));
				dto.setSalary(rs.getInt("salary"));
				
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	//[5] 입사년도 사원 검색 
	public List<EmpDTO> getHiredateList(String year){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//반환타입
		List<EmpDTO> list = new ArrayList();
		//쿼리
		String sql = "select eno,ename,job,salary,dno "
				+ 		" from emp where hiredate like ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + year + "%");
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setSalary(rs.getInt("salary"));
				dto.setDno(rs.getInt("dno"));
				
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
