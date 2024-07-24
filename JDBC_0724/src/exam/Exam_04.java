package exam;

import java.util.Scanner;

import model.MemberDAO;
import model.MemberDTO;

//-- (4) tbl_member테이블에 사원등록
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		
		//입력
		System.out.print("고객번호:");
		int custno = Integer.parseInt(scn.nextLine());
		dto.setCustno(custno);
		
		System.out.print("고객성명:");
		dto.setCustname(scn.nextLine());
		
		System.out.print("전화번호:");
		dto.setPhone(scn.nextLine());
		
		System.out.print("성별(M/F):");
		dto.setGender(scn.nextLine());
		
		System.out.print("등록일자:");
		dto.setJoindate(scn.nextLine());
		
		System.out.print("고객등급:");
		dto.setGrade(scn.nextLine());
		
		System.out.print("도시코드:");
		dto.setCity(scn.nextLine());
		
		int row = dao.memberWrite(dto);
		if(row==1) {
			System.out.println("등록성공");
		}else {
			System.out.println("등록실패");
		}
		
	}

}
