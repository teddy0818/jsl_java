package com.jslhrd.exam;

import com.jslhrd.model.EmpDAO;

public class Exam_01 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		
		int cnt = dao.getCount();
		
		System.out.println("사원수 : " + cnt);
	}

}
