package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ScoreDAO {
	
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
	
	// 성적 등록 메서드
    public int scoreWrite(ScoreDTO dto) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int row = 0;
        String sql = "INSERT INTO tbl_score_201905 (syear, sclass, sno, kor, eng, mat) "
                   + "VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            conn = getConnection(); // 데이터베이스 연결
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getSyear());    // 학년
            pstmt.setString(2, dto.getSclass());   // 반
            pstmt.setString(3, dto.getSno());      // 번호
            pstmt.setInt(4, dto.getKor());         // 국어 점수
            pstmt.setInt(5, dto.getEng());         // 영어 점수
            pstmt.setInt(6, dto.getMat());         // 수학 점수
            
            row = pstmt.executeUpdate();  // 쿼리 실행
            
        } catch (SQLException e) {
            e.printStackTrace();  // 예외 처리
        } finally {
            // 자원 반환
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return row; // 삽입된 행의 수 반환
    }
	 
    public List<ScoreDTO> scoreList() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<ScoreDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM tbl_score_201905";
        
        try {
            conn = getConnection(); // 데이터베이스 연결
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                ScoreDTO dto = new ScoreDTO();
                dto.setSyear(rs.getString("syear"));   // 학년
                dto.setSclass(rs.getString("sclass"));  // 반
                dto.setSno(rs.getString("sno"));       // 번호
                dto.setKor(rs.getInt("kor"));          // 국어 점수
                dto.setEng(rs.getInt("eng"));          // 영어 점수
                dto.setMat(rs.getInt("mat"));          // 수학 점수

                list.add(dto); // 리스트에 추가
            }
            
        } catch (SQLException e) {
            e.printStackTrace();  // 예외 처리
        } finally {
            // 자원 반환
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list; // 조회된 성적 정보 리스트 반환
    }

}
