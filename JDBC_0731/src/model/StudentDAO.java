package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	
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
	
	 // 학생 등록 메서드
    public int studentWrite(StudentDTO dto) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        // 반환타입
        int row = 0;
        // 쿼리문장
        String sql = "INSERT INTO tbl_student_201905 (syear, sclass, sno, sname, birth, gender, tel1, tel2, tel3) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            conn = getConnection(); 
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getSyear()); 
            pstmt.setString(2, dto.getSclass());
            pstmt.setString(3, dto.getSno());    
            pstmt.setString(4, dto.getSname()); 
            pstmt.setString(5, dto.getBirth());    
            pstmt.setString(6, dto.getGender());
            pstmt.setString(7, dto.getTel1());     
            pstmt.setString(8, dto.getTel2());    
            pstmt.setString(9, dto.getTel3());    
            
            row = pstmt.executeUpdate();  
            
        } catch (Exception e) {
            e.printStackTrace();  
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return row; 
    }
   
    public List<StudentDTO> getAllStudents() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<StudentDTO> studentList = new ArrayList<>();

        String sql = "SELECT * FROM tbl_student_201905";

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                StudentDTO dto = new StudentDTO();
                
                dto.setSyear(rs.getString("syear"));
                dto.setSclass(rs.getString("sclass"));
                dto.setSno(rs.getString("sno"));
                dto.setSname(rs.getString("sname"));
                dto.setBirth(rs.getString("birth"));
                dto.setGender(rs.getString("gender"));
                dto.setTel1(rs.getString("tel1"));
                dto.setTel2(rs.getString("tel2"));
                dto.setTel3(rs.getString("tel3"));
                
                studentList.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return studentList;
    }

    public int deleteStudentAndScores(String syear, String sclass, String sno) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        int rowsAffected = 0;

        String deleteScoresSql = "DELETE FROM tbl_score_201905 WHERE syear = ? AND sclass = ? AND sno = ?";
        String deleteStudentSql = "DELETE FROM tbl_student_201905 WHERE syear = ? AND sclass = ? AND sno = ?";

        try {
            conn = getConnection();
            conn.setAutoCommit(false); 

            pstmt1 = conn.prepareStatement(deleteScoresSql);
            pstmt1.setString(1, syear);
            pstmt1.setString(2, sclass);
            pstmt1.setString(3, sno);
            rowsAffected += pstmt1.executeUpdate();

            pstmt2 = conn.prepareStatement(deleteStudentSql);
            pstmt2.setString(1, syear);
            pstmt2.setString(2, sclass);
            pstmt2.setString(3, sno);
            rowsAffected += pstmt2.executeUpdate();

            conn.commit(); 

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if (conn != null) conn.rollback(); 
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            // 자원 반환
            try {
                if (pstmt1 != null) pstmt1.close();
                if (pstmt2 != null) pstmt2.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return rowsAffected;
    }
    
    public List<StudentDTO> getAllStudentInfo() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<StudentDTO> studentList = new ArrayList<>();

        String sql = "SELECT \n"
        		+ "    s.syear,\n"
        		+ "    s.sclass,\n"
        		+ "    s.sno,\n"
        		+ "    s.sname,\n"
        		+ "    CASE s.gender\n"
        		+ "        WHEN 'M' THEN '남'\n"
        		+ "        WHEN 'F' THEN '여'\n"
        		+ "        ELSE '기타'\n"
        		+ "    END AS gender,\n"
        		+ "    sc.kor AS kor,\n"
        		+ "    sc.eng AS eng,\n"
        		+ "    sc.mat AS math,\n"
        		+ "    (sc.kor + sc.eng + sc.mat) AS tot,\n"
        		+ "    ROUND((sc.kor + sc.eng + sc.mat) / 3.0, 1) AS avg\n"
        		+ "FROM \n"
        		+ "    tbl_student_201905 s\n"
        		+ "JOIN \n"
        		+ "    tbl_score_201905 sc\n"
        		+ "ON \n"
        		+ "    s.syear = sc.syear\n"
        		+ "    AND s.sclass = sc.sclass\n"
        		+ "    AND s.sno = sc.sno\n"
        		+ "ORDER BY \n"
        		+ "    s.syear, s.sclass, s.sno";

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                StudentDTO dto = new StudentDTO();
                
                dto.setSyear(rs.getString("syear"));
                dto.setSclass(rs.getString("sclass"));
                dto.setSno(rs.getString("sno"));
                dto.setSname(rs.getString("sname"));
                dto.setGender(rs.getString("gender"));
                dto.setKor(rs.getInt("kor"));
                dto.setEng(rs.getInt("eng"));
                dto.setMath(rs.getInt("math"));
                dto.setTot(rs.getInt("tot"));
                dto.setAvg(rs.getDouble("avg"));
                
                studentList.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return studentList;
    }
}
