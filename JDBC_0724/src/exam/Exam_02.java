package exam;

import java.util.List;

import model.MemberDAO;
import model.MemberDTO;

//-- (2) tbl_member테이블 전체 목록 구하기
/*   출력 예시
 *   고객번호  고객이름  전화번호         성별    가입일자        고객등급  도시코드
 *   100001  김행복   010-1111-2222  남자   2015년12월02일   VIP    01
 *    1. 성별은 M->남자, F-> 여자
 *    2. 가입일자  yyyy년mm월dd일 출력
 *    3. 고객등급 A->VIP, B->일반, C->직원으로 출력
 */
public class Exam_02 {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		
		List<MemberDTO> list = dao.memberList();
		System.out.println("고객번호\t고객이름\t전화번호\t\t성별\t가입일자\t\t고객등급\t도시코드");
		if(list.size()==0) {
			System.out.println("등록된 자료가 없습니다.");
		}else {
			for(MemberDTO dto : list) {
				System.out.print(dto.getCustno() + "\t");
				System.out.print(dto.getCustname() + "\t");
				System.out.print(dto.getPhone() + "\t");
				String gender="여자";
				if(dto.getGender().equals("M"))
					gender="남자";
				System.out.print(gender + "\t");
				
				System.out.print(dto.getJoindate() + "\t");
				System.out.print(dto.getGrade() + "\t");
				
				System.out.print(dto.getCity() + "\n");
			}
		}
	}

}
