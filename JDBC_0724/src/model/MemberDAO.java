package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	// 메소드 정의
	//(1) tbl_member 테이블의 자료건수 구하기
	public int memberCount() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//반환타입
		int row = 0;
		//쿼리문장
		String sql="select count(*) as counter from tbl_member";
		
		try{
			conn = getConnection();
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

	//-- (2) tbl_member테이블 전체 목록 구하기
	public List<MemberDTO> memberList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//반환타입
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		//쿼리문장
		String sql="select * from tbl_member";
		
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setCustno(rs.getInt("custno"));
				dto.setCustname(rs.getString("custname"));
				dto.setPhone(rs.getString("phone"));
				dto.setGender(rs.getString("gender"));
				dto.setJoindate(rs.getString("joindate"));
				dto.setGrade(rs.getString("grade"));
				dto.setCity(rs.getString("city"));

				list.add(dto);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	//-- (3) tbl_member테이블에서 사원번호를 이용한 검색
	public MemberDTO memberSearch(int custno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//반환타입
		MemberDTO dto = new MemberDTO();
		//쿼리문장
		String sql="select * from tbl_member where custno=?";
		
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custno);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setCustno(rs.getInt("custno"));
				dto.setCustname(rs.getString("custname"));
				dto.setPhone(rs.getString("phone"));
				dto.setGender(rs.getString("gender"));
				dto.setJoindate(rs.getString("joindate"));
				dto.setGrade(rs.getString("grade"));
				dto.setCity(rs.getString("city"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	
	//-- (4) tbl_member테이블에 사원등록
	public int memberWrite(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//반환타입
		int row = 0;
		//쿼리문장
		String sql="insert into tbl_member(custno, custname,phone,gender,joindate,grade,city)\r\n"
				+ "            values(?,?,?,?,?,?,?)";
		
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getCustno());
			pstmt.setString(2, dto.getCustname());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getGender());
			pstmt.setString(5, dto.getJoindate());
			pstmt.setString(6, dto.getGrade());
			pstmt.setString(7, dto.getCity());
			
			row = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return row;
	}
	
}
