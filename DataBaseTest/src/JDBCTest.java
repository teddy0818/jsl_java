import java.sql.*;

public class JDBCTest {

	public static void main(String[] args) {
		try {
			// JDBC 드라이버 
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("JDBC 드라이버 로딩 성공");
		}catch(Exception e) {
			System.out.println("JDBC 드라이버 로딩 실패");
			e.printStackTrace();
		}
		
		try {
			// JDBC Connection 
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			System.out.println("Connection 성공");
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from dept");
			System.out.println("부서번호\t부서명\t지역명");
			while(rs.next()) {
				System.out.print(rs.getInt("dno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.print(rs.getString("loc") + "\t");
				System.out.println();
			}
			
		}catch(Exception e) {
			System.out.println("Connection 실패");
			e.printStackTrace();
		}

	}

}
