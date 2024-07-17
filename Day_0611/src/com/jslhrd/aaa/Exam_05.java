package com.jslhrd.aaa;
class SuperE{
	int a=10;
	int b=20;
	void print() {
		System.out.printf("a=%d, b=%d \n", a,b);
	}
}
class ChildE extends SuperE{
	int a=100;
	int x=100;
	int y=200;
	void cprint() {
		
		System.out.printf("a=%d, x=%d, y=%d \n", super.a,x,y);
	}
}

public class Exam_05 {
	public static void main(String[] args) {
		SuperE se = new SuperE();
		se.print();
		
		ChildE ce = new ChildE();
		ce.cprint();
	}

}
