package com.jslhrd.emp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.emp.model.EmpDAO;

public class EmpDAO {
	private static Connection getConnection() throws Exception{
		//드라이버 로딩
		Class.forName("oracle.jdbc.OracleDriver");
		//커넥션 생성
		Connection conn = 
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
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
	
	// 1번
	public List<EmpDTO> getEmpList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//반환타입
		List<EmpDTO> list = new ArrayList();
		
		//쿼리
		String sql = "SELECT eno, ename, job, TO_CHAR(HIREDATE , 'YY\"년\"MM\"월\"DD\"일\"') AS formatted_date, salary, dno FROM emp";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setHiredate(rs.getString("formatted_date"));
				dto.setSalary(rs.getInt("salary"));
				dto.setDno(rs.getInt("dno"));
				
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	// 2번
	public EmpDTO getEmpByDno(int inputDno){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//반환타입
		EmpDTO emp = new EmpDTO();
		
		//쿼리
		String sql = "SELECT eno, ename, job, TO_CHAR(HIREDATE , 'YY\"년\"MM\"월\"DD\"일\"') AS formatted_date, salary, dno FROM emp\r\n"
				+ "WHERE eno = ?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, inputDno);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				emp.setEno(rs.getInt("eno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setHiredate(rs.getString("formatted_date"));
				emp.setSalary(rs.getInt("salary"));
				emp.setDno(rs.getInt("dno"));
			}
			if(emp.getEno() == 0) {
				return null;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

		
		return emp;
	}
	

	// 3번
	public EmpDTO getSalaryInfo(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//반환타입
		EmpDTO emp = new EmpDTO();
		
		//쿼리
		String sql = "SELECT max(SALARY) AS max, min(salary) AS min, sum(salary) AS total, round(avg(salary),2) AS avg FROM emp";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				emp.setMax(rs.getInt("max"));
				emp.setMin(rs.getInt("min"));
				emp.setTotal(rs.getInt("total"));
				emp.setAvg(rs.getDouble("avg"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

		
		return emp;
	}
	
	
	// 4번
	public List<EmpDTO> getAvgSalaryByDno() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//반환타입
		List<EmpDTO> list = new ArrayList();
		
		//쿼리
		String sql = "SELECT dno, count(*) AS empCnt, round(avg(salary),2) AS avg\r\n"
				+ "FROM emp\r\n"
				+ "GROUP BY dno";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setDno(rs.getInt("dno"));
				dto.setEmpCnt(rs.getInt("empCnt"));
				dto.setAvg(rs.getDouble("avg"));
				
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	

	// 5번
	public List<EmpDTO> getSalaryByJob() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//반환타입
		List<EmpDTO> list = new ArrayList();
		
		//쿼리
		String sql = "SELECT job, max(salary) as max, min(salary) as min FROM emp\r\n"
				+ "GROUP BY JOB \r\n"
				+ "HAVING min(SALARY) >= 2000\r\n"
				+ "ORDER BY min(SALARY) DESC ";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setJob(rs.getString("job"));
				dto.setMax(rs.getInt("max"));
				dto.setMin(rs.getInt("min"));

				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	

	// 6번
	public List<EmpDTO> getSalaryListByDname() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//반환타입
		List<EmpDTO> list = new ArrayList();
		
		//쿼리
		String sql = "SELECT dno,\r\n"
				+ "       count(*) AS empCnt,\r\n"
				+ "       round(avg(salary), 0) AS avg,\r\n"
				+ "       CASE \r\n"
				+ "           WHEN dno = 10 THEN 'ACCOUNTING'\r\n"
				+ "           WHEN dno = 20 THEN 'RESEARCH'\r\n"
				+ "           WHEN dno = 30 THEN 'SALES'\r\n"
				+ "           WHEN dno = 40 THEN 'OPERATIONS'\r\n"
				+ "           ELSE '오류'\r\n"
				+ "       END AS dname\r\n"
				+ "       FROM emp\r\n"
				+ " GROUP BY dno ";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setDno(rs.getInt("dno"));
				dto.setDname(rs.getString("dname"));
				dto.setEmpCnt(rs.getInt("empCnt"));
				dto.setAvg(rs.getDouble("avg"));

				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
