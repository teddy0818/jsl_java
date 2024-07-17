package com.jslhrd.exam;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

import com.jslhrd.model.EmpDAO;
import com.jslhrd.model.EmpDTO;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		EmpDAO dao = new EmpDAO();
		
		System.out.print("입사년도:");
		String year = scn.next();
		if(year.length()>=4)
			year = year.substring(2);
		//System.out.print(year);
		
		List<EmpDTO> list = dao.getHiredateList(year);
		//숫자 형식화
		DecimalFormat df = new DecimalFormat("#,###");
		
		if(list.size()==0) {
			System.out.println("등록된 사원정보가 없음");
		}else {
			System.out.println("번호\t이름\t업무명\t\t급여\t부서명");
			for(EmpDTO dto : list) {
				String dname = "";
				if(dto.getDno()==10) {
					dname="전산부";
				}else if(dto.getDno()==20) {
					dname="총무부";
				}else if(dto.getDno()==30) {
					dname="인사부";
				}else {
					dname="경영부";
				}
				System.out.print(dto.getEno() + "\t");
				System.out.print(dto.getEname() + "\t");
				if(dto.getJob().length()<8)
					System.out.print(dto.getJob() + "\t\t");
				else
					System.out.print(dto.getJob() + "\t");
				System.out.print(df.format(dto.getSalary()) + "\t");
				System.out.print(dname + "\n");
			}
			System.out.println(year+"년 입사인원수 : " + list.size());
		}		
	}

}
