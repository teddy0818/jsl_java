package com.jslhrd.emp.main;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

import com.jslhrd.emp.model.EmpDAO;
import com.jslhrd.emp.model.EmpDTO;

public class Exam_04 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		List<EmpDTO> list = dao.getAvgSalaryByDno();
		DecimalFormat df = new DecimalFormat("#,###");
		
		if(list.size()==0) {
			System.out.println("등록된 사원정보가 없음");
		}else {
			// 부서번호, 사원수, 평균급여
			System.out.println("부서번호\t사원수\t평균급여");
			int total=0;
			for(EmpDTO dto : list) {
				total += dto.getEmpCnt();
				System.out.print(dto.getDno() + "\t");
				System.out.print(dto.getEmpCnt() + "\t");
				System.out.print(dto.getAvg());
				System.out.println();
			}
			System.out.println("총사원수 : "+ total);
		}
		
		
	}

}
