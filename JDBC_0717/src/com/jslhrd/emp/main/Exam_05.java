package com.jslhrd.emp.main;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

import com.jslhrd.emp.model.EmpDAO;
import com.jslhrd.emp.model.EmpDTO;

public class Exam_05 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		List<EmpDTO> list = dao.getSalaryByJob();
		DecimalFormat df = new DecimalFormat("#,###");
		
		if(list.size()==0) {
			System.out.println("등록된 사원정보가 없음");
		}else {
			// 직급(job)별 사원의 최대, 최저 급여
			System.out.println("직급\t최대급여\t최소급여");
			for(EmpDTO dto : list) {
				System.out.print(dto.getJob() + "\t");
				System.out.print(df.format(dto.getMax()) + "\t");
				System.out.print(df.format(dto.getMin()));
				System.out.println();
			}
		}
		
		
	}

}
