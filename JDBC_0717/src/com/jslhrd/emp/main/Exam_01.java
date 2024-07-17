package com.jslhrd.emp.main;

import java.text.DecimalFormat;
import java.util.List;

import com.jslhrd.emp.model.EmpDAO;
import com.jslhrd.emp.model.EmpDTO;

public class Exam_01 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		List<EmpDTO> list = dao.getEmpList();
		DecimalFormat df = new DecimalFormat("#,###");
		
		if(list.size()==0) {
			System.out.println("등록된 사원정보가 없음");
		}else {
			// 사원번호, 이름, 직급, 입사일자, 급여, 부서번호
			System.out.println("사원번호\t이름\t직급\t입사일자\t급여");
			int total=0;
			for(EmpDTO dto : list) {
				total += dto.getSalary();
				System.out.print(dto.getEno() + "\t");
				System.out.print(dto.getEname() + "\t");
				System.out.print(dto.getJob() + "\t");
				System.out.print(dto.getHiredate() + "\t");
				System.out.print(df.format(dto.getSalary()) + "\n");
			}
			System.out.println("급여합계 : " + df.format(total));
		}
		
		
		
	}

}
