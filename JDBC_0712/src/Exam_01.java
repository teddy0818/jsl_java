import java.sql.*;

public class Exam_01 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String myURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String myID = "scott";
		String myPass = "tiger";
		
		//  드라이버 로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		} catch(Exception e) {
			System.out.println("드라이버 로딩 실패");
		}
		
		// 커넥션 연결 및 명령문 처리
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			// System.out.println("커넥션 : " + conn);
			String sql = "SELECT * FROM dept";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			// 출력
			System.out.println("번호\t\t부서명\t\t지역명");
			while(rs.next()) {
				int dno = rs.getInt("DNO");
				String dname = rs.getString("DNAME");
				String loc = rs.getString("LOC");
				System.out.printf("%d\t\t%s\t\t%s\n",dno, dname, loc);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("커넥션 연결 실패");
			e.printStackTrace();
		}
		
		

	}

}
