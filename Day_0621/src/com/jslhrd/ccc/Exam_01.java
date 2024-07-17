package com.jslhrd.ccc;

import java.text.DecimalFormat;

//숫자 형식화 클래스
public class Exam_01 {
	public static void main(String[] args) {
		// 0  # , . %
		DecimalFormat df = new DecimalFormat("#,###");
		DecimalFormat df2 = new DecimalFormat("0,000");
		String s = df.format(123456789);
		System.out.println("s = " + s);
		s = df.format(123);
		System.out.println("s = " + s);
		String s2 = df2.format(1234567);
		System.out.println("s2 = " + s2);
		s2 = df2.format(123);
		System.out.println("s2 = " + s2);
		
		
	}

}
