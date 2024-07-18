package com.jslhrd.exam;

import java.util.List;

import com.jslhrd.model.MemberDAO;
import com.jslhrd.model.MemberDTO;

public class Member_01 {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		
		List<MemberDTO> list = dao.getMemberList();
		System.out.println("회원번호\t회원성명\t연락처\t성별\t가입일자\t고객등급\t도시코드");
		for(MemberDTO dto : list) {
			System.out.print(dto.getCustno() + "\t");
			System.out.print(dto.getCustname() + "\t");
			System.out.print(dto.getPhone() + "\t");
			System.out.print(dto.getGender() + "\t");
			System.out.print(dto.getJoindate() + "\t");
			System.out.print(dto.getGrade() + "\t");
			System.out.print(dto.getCity() + "\n");
		}
	}
}
