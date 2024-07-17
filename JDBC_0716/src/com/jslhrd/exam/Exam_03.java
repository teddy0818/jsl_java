package com.jslhrd.exam;

import java.util.List;

import com.jslhrd.model.EmpDAO;
import com.jslhrd.model.EmpDTO;

public class Exam_03 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		
		List<EmpDTO> list = dao.getDnoList();
		int total=0;//총사원수
		System.out.println("부서명\t사원수");
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
			//System.out.print(dto.getDno() + "\t");
			System.out.print(dname + "\t");
			System.out.print(dto.getCounter() + "\n");
			//총사원수
			total += dto.getCounter();
		}
		System.out.println("총사원수 : " + total);
	}

}
