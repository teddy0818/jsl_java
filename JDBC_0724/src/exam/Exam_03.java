package exam;

import java.util.Scanner;

import model.MemberDAO;
import model.MemberDTO;

//-- (3) tbl_member테이블에서 사원번호를 이용한 검색
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		MemberDAO dao = new MemberDAO();
		
		System.out.print("고객번호 : ");
		int custno = scn.nextInt();
		
		MemberDTO dto = dao.memberSearch(custno);
		
		if(dto.getCustno()==0) {
			System.out.println("등록된 자료가 없음");
		}else {
			System.out.println("고객번호 : " + dto.getCustno());
			//   .   .    .
			System.out.println("도시코드 : " + dto.getCity());
		}
	}
	//-- (4) tbl_member테이블에 사원등록
	

}
