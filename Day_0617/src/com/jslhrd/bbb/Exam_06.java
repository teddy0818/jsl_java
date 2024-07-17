package com.jslhrd.bbb;

public class Exam_06 {
	public static void main(String[] args) {
		String str1 = "Korea";
		String str2 = "Korea-Seoul";
		String str3 = new String("Korea");
		//문자열 길이
		int len = str1.length();//5
		System.out.println(len);
		System.out.println("123456789".length());
		//문자열을 소문자로, 대문자로

		System.out.println("소문자로 : " + str1.toLowerCase());
		System.out.println("대문자로 : " + str1.toUpperCase());
		
		//1문자씩 분리
		for(int i=0; i<len;i++) {
			System.out.println(str1.charAt(i));
		}
		
		String k = str2.substring(0,5);
		System.out.println("k : " + k);
	}

}
