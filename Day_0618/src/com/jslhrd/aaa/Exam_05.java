package com.jslhrd.aaa;

public class Exam_05 {

	public static void main(String[] args) {
		//지정된 값을 문자열로 String.valueOf(정수, 실수 문자)
		int a=20;
		String str1 = a+"";
		String str2 = String.valueOf(a);
		String str3 = String.valueOf(123);
		
		//형식화된 문자열 만들기 String.format();
		String str4 = String.format("정수 %d 실수 %.2f", 35, 12.1567);
		System.out.println("str4 + " + str4);
		
		
	}

}
