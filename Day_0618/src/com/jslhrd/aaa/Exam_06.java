package com.jslhrd.aaa;

public class Exam_06 {
	public static void main(String[] args) {
		//기본형을 문자열
		String s = ""+5;
		String s1 = String.valueOf(3.14);
		String s2 = Integer.toString(123);
		
		//문자열을 기본형
		//랩퍼 클래스 : 기본자료형을 객체화
		//Integer, Long, Character, Byte, Long, Float, Double, Boolean

		String s3="35";
		int a = Integer.parseInt(s3);
		int aa = Integer.valueOf(s3);
		
		double b = Double.parseDouble("3.14");
		double bb = Double.valueOf("3.14");
	}

}
