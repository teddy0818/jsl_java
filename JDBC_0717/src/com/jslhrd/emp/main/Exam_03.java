package com.jslhrd.emp.main;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

import com.jslhrd.emp.model.EmpDAO;
import com.jslhrd.emp.model.EmpDTO;

public class Exam_03 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		EmpDTO dto = dao.getSalaryInfo();
		DecimalFormat df = new DecimalFormat("#,###");
		if(dto==null) {
			System.out.println("등록된 사원정보가 없음");
		} else {
			System.out.println("급여최대\t급여최소\t급여총액\t평균급여");
			System.out.print(df.format(dto.getMax()) + "\t");
			System.out.print(df.format(dto.getMin()) + "\t");
			System.out.print(df.format(dto.getTotal()) + "\t");
			System.out.print(dto.getAvg() + "\t");
		}
		
		
	}

}
