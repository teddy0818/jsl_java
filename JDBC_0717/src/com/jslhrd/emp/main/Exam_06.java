package com.jslhrd.emp.main;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

import com.jslhrd.emp.model.EmpDAO;
import com.jslhrd.emp.model.EmpDTO;

public class Exam_06 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		List<EmpDTO> list = dao.getSalaryListByDname();
		DecimalFormat df = new DecimalFormat("#,###");
		
		if(list.size()==0) {
			System.out.println("등록된 사원정보가 없음");
		}else {
			// 부서번호, 부서명,사원수, 부서별 사원의 평균 급여
			System.out.println("부서번호\t부서명\t사원수\t평균급여");
			for(EmpDTO dto : list) {
				System.out.print(dto.getDno() + "\t");
				System.out.print(dto.getDname() + "\t");
				System.out.print((dto.getEmpCnt()) + "\t");
				System.out.print(df.format(dto.getAvg()));
				System.out.println();
			}
		}
		
		
	}

}
