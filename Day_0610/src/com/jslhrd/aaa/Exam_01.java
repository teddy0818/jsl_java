package com.jslhrd.aaa;

public class Exam_01 {
	public static void main(String[] args) {
		AA aa = new AA();
		//멤버변수접근
		//aa.a=100;//private 다른 클래스에서 접근 불가
		aa.b=200;
		aa.c=300;
		aa.d=400;
		//멤버메소드 접근
		//aa.printA();//private 다른 클래스에서 접근 불가
		aa.printB();
		aa.printC();
		aa.printD();
	}

}
