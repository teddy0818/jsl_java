package com.jslhrd.aaa;

public class Exam_03 {
	//문자열 분리(토큰: 구분자) = split(구분자)
	public static void main(String[] args) {
		String str="123 456 789,111,222 333,444 555";
		
		String strArr[] = str.split(",");
		for(int i=0; i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}

	}

}
