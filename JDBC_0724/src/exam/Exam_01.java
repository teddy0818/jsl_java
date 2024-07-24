package exam;

import model.MemberDAO;

//-- (1) tbl_member 테이블의 자료건수 구하기
public class Exam_01 {
	public static void main(String[] args) {
		//DAO 객체 생성
		MemberDAO dao = new MemberDAO();
		
		int cnt = dao.memberCount();
		
		if(cnt==0) {
			System.out.println("등록된 자료가 없음");
		}else {
			System.out.println("등록된 자료는 : " + cnt);
		}
	}

}
