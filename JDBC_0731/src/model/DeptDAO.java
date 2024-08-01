package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {
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
	
	public List<DeptDTO> getClassStats() {
        List<DeptDTO> statsList = new ArrayList<>();
        String sql = "SELECT " +
                "    s.syear, s.sclass, t.tname, " +
                "    SUM(sc.kor) AS korTotal, SUM(sc.eng) AS engTotal, SUM(sc.mat) AS matTotal, " +
                "    ROUND(AVG(sc.kor), 1) AS korAvg, ROUND(AVG(sc.eng), 1) AS engAvg, ROUND(AVG(sc.mat), 1) AS matAvg " +
                "FROM " +
                "    tbl_student_201905 s " +
                "JOIN " +
                "    tbl_score_201905 sc ON s.syear = sc.syear AND s.sclass = sc.sclass AND s.sno = sc.sno " +
                "JOIN " +
                "    tbl_dept_201905 t ON s.syear = t.syear AND s.sclass = t.sclass " +
                "GROUP BY " +
                "    s.syear, s.sclass, t.tname " +
                "ORDER BY " +
                "    s.syear, s.sclass";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                DeptDTO dto = new DeptDTO();
                dto.setSyear(rs.getString("syear"));
                dto.setSclass(rs.getString("sclass"));
                dto.setTname(rs.getString("tname"));
                dto.setKorTotal(rs.getInt("korTotal"));
                dto.setEngTotal(rs.getInt("engTotal"));
                dto.setMatTotal(rs.getInt("matTotal"));
                dto.setKorAvg(rs.getDouble("korAvg"));
                dto.setEngAvg(rs.getDouble("engAvg"));
                dto.setMatAvg(rs.getDouble("matAvg"));

                statsList.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statsList;
    }
}
