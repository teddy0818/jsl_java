import java.sql.*;

public class Exam_02 {

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
		
//			String sql = "SELECT eno, ename, job, hiredate, salary FROM emp WHERE dno = 10";
			String sql = "SELECT ename, salary, salary+300 AS bonus FROM emp";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			// 출력
//			System.out.println("번호\t이름\t업무\t입사일\t급여");
//			while (rs.next()) {
//				int eno = rs.getInt("eno");
//				String ename = rs.getString("ename");
//				String job = rs.getString("job");
//				String hiredate = rs.getString("hiredate");
//				String salary = rs.getString("salary");
//				
//				System.out.printf("%d\t%s\t%s\t%s\t%s\n", eno, ename, job, hiredate, salary);
//			}
			System.out.println("이름\t급여\t보너스");
			while (rs.next()) {
				String ename = rs.getString("ename");
				int salary = rs.getInt("salary");
				int bonus = rs.getInt("bonus");
				
				System.out.printf("%s\t%d\t%d\n", ename , salary, bonus);
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
