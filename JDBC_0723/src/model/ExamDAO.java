package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.concurrent.ExecutionException;

public class ExamDAO {
	
	private static Connection getConnection() throws Exception{
		//드라이버 로딩
		Class.forName("oracle.jdbc.OracleDriver");
		//커넥션 생성
		Connection conn = 
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		return conn;
	}
	
	// 테이블 생성 메소드
	public int createTable() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int row = 5; //  성공하면 1, 실패하면 0 반환
		String sql = "CREATE TABLE student (\n"
				+ "	hakbun char(4) PRIMARY KEY,\n"
				+ "	name varchar2(20) NOT NULL,\n"
				+ "	gender char(1),\n"
				+ "	score number(3)\n"
				+ ")";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			// executeUpdate : 반환값이 1이라면 성공
			pstmt.executeUpdate();
			row = 1;
			System.out.println(row);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return row;
	}
	
	//tbl_city insert
		public int cityWrite(CityDTO dto) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			//반환타입
			int row=0;
			//쿼리
			String sql="insert into tbl_city(city,cityname) values(?,?)";
			
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, dto.getCity());
				pstmt.setString(2, dto.getCityname());
				
				row = pstmt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return row;
		}

}
