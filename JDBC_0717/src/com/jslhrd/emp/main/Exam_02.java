package com.jslhrd.emp.main;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

import com.jslhrd.emp.model.EmpDAO;
import com.jslhrd.emp.model.EmpDTO;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("사원번호 : ");
		int inputEno = scan.nextInt();
		
		EmpDAO dao = new EmpDAO();
		DecimalFormat df = new DecimalFormat("#,###");
		EmpDTO dto = dao.getEmpByDno(inputEno);
		if(dto==null) {
			System.out.println("등록된 사원정보가 없음");
		} else {
			System.out.println("사원번호\t이름\t직급\t입사일자\t급여");
			System.out.print(dto.getEno() + "\t");
			System.out.print(dto.getEname() + "\t");
			System.out.print(dto.getJob() + "\t");
			System.out.print(dto.getHiredate() + "\t");
			System.out.print(df.format(dto.getSalary()) + "\n");
		}
		
		
	}

}
