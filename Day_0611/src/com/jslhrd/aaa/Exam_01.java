package com.jslhrd.aaa;
class SuperA{
	int a=10;
	void exam() {
		System.out.println("SuperA.a = " + a);
	}
}
class ChildA extends SuperA{
	int b=20;
	
	void test() {
		System.out.println("a=" + a);		
		System.out.println("b=" + b);		
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		
		SuperA sa  = new SuperA();
		
		ChildA ca = new ChildA();
		System.out.println(ca.a);
		ca.exam();
		ca.test();
	}

}
