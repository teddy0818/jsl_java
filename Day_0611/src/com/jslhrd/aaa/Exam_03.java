package com.jslhrd.aaa;
class SuperC{
	private int a=10;//상속불가
	int b=20;
	void exam() {
		System.out.println("superC.a = " + a);
		System.out.println("superC.b = " + b);
	}
}
class ChildC extends SuperC{
	void test() {
		//System.out.println("superC.a = " + a);
		System.out.println("superC.b = " + b);
	}	
}
public class Exam_03 {

	

}
