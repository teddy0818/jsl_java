package com.jslhrd.aaa;

public class Exam_04 {

	public static void main(String[] args) {
		String str="Korea-Apple-JslHRD JAVA";
		//문자열 포함 유무 contains("문자열")
		boolean bool = str.contains("JAVA");
		System.out.println(bool);
		//문자열 대치 replace();
		String str2 = str.replace("Korea","Nation");
		System.out.println(str);
		System.out.println(str2);
		//문자열에 포함된 공백제거(좌우만 가능) trim()
		String str3="    Java Program    ";
		String str4=str3.trim();
		System.out.println("str3 : " + str3.length());
		System.out.println("str4 : " + str4.length());
		str3.equals("Java Program");
	}

}
