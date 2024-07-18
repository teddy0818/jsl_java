package com.jslhrd.exam;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.model.ExamDAO;
import com.jslhrd.model.ExamDTO;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		ExamDAO dao = new ExamDAO();
		
		System.out.print("이름입력:");
		String name = scn.next().toUpperCase();
		
		List<ExamDTO> list = dao.exam_01(name);
		System.out.println("사원번호\t이름\t부서번호\t부서명");
		if(list.size() != 0 ) {
			for(ExamDTO dto : list) {
				System.out.print(dto.getEno() + "\t");
				System.out.print(dto.getEname() + "\t");
				System.out.print(dto.getDno() + "\t");
				System.out.print(dto.getDname() + "\n");	
			}
		}else {
			System.out.println("등록된 정보가 없습니다.");
		}
		
	}

}
