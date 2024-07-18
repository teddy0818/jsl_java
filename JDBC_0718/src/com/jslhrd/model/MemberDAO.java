package com.jslhrd.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = 
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		
		return conn;				
	}
	//회원 목록 출력
	public List<MemberDTO> getMemberList(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//쿼리
		String sql="select * from tbl_member_001";
		//반환타입
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		
		try {
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
	
	
}
