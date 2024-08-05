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
	
    public int scoreWrite(ScoreDTO dto) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int row = 0;
        String sql = "INSERT INTO tbl_score_201905 (syear, sclass, sno, kor, eng, mat) "
                   + "VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            conn = getConnection(); 
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getSyear());    
            pstmt.setString(2, dto.getSclass());  
            pstmt.setString(3, dto.getSno());      
            pstmt.setInt(4, dto.getKor());         
            pstmt.setInt(5, dto.getEng());        
            pstmt.setInt(6, dto.getMat());        
            
            row = pstmt.executeUpdate();  
            
        } catch (SQLException e) {
            e.printStackTrace();  
        } finally {
            // 자원 반환
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return row; 
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
                dto.setSyear(rs.getString("syear"));   
                dto.setSclass(rs.getString("sclass"));
                dto.setSno(rs.getString("sno"));       
                dto.setKor(rs.getInt("kor"));          
                dto.setEng(rs.getInt("eng"));        
                dto.setMat(rs.getInt("mat"));        

                list.add(dto); 
            }
            
        } catch (SQLException e) {
            e.printStackTrace(); 
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
        return list; 
    }

}
