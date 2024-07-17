package com.jslhrd.exam;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

import com.jslhrd.model.EmpDAO;
import com.jslhrd.model.EmpDTO;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		EmpDAO dao = new EmpDAO();
		
		System.out.print("급여입력:");
		int salary = scn.nextInt();
		
		List<EmpDTO> list = dao.getSalaryList(salary);
		//숫자 형식화
		DecimalFormat df = new DecimalFormat("#,###");
		
		if(list.size()==0) {
			System.out.println("등록된 사원정보가 없음");
		}else {
			System.out.println("번호\t이름\t입사일자\t급여");
			int total=0;
			for(EmpDTO dto : list) {
				total += dto.getSalary();
				//날자분리
				String yy = dto.getHiredate().substring(0,4);
				String mm = dto.getHiredate().substring(5,7);
				String dd = dto.getHiredate().substring(8,10);
				String ymd = yy+"년"+mm+"월"+dd+"일";
				System.out.print(dto.getEno() + "\t");
				System.out.print(dto.getEname() + "\t");
				//System.out.print(dto.getHiredate() + "\t");
				System.out.print(ymd + "\t");
				System.out.print(df.format(dto.getSalary()) + "\n");
			}
			System.out.println("총급여 : " + df.format(total));
		}
	}

}
