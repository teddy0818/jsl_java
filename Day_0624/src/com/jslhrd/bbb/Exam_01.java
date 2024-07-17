package com.jslhrd.bbb;

import java.util.ArrayList;
import java.util.List;

public class Exam_01 {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		
		sList.add("이학생");
		sList.add("김학생");
		sList.add("박학생");
		sList.add("강학생");
		sList.add("오학생");
		
		boolean bool = sList.contains("오학생");
		System.out.println(bool);
		
		
	}

}
