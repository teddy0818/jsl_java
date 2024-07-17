package com.jslhrd.aaa;
//메소드 오버로딩
class SuperD{
	void add() {
		System.out.println("1+2=" + 3);
	}
	void add(int a) {
		
	}
}
class ChildD extends SuperD{
	//오버라이딩
	void add() {
		System.out.println("1+2=" + 5);
	}
	void add(int a, int b) {
		System.out.println(a + "+ " + b + "=" + (a+b));
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		SuperD d = new SuperD();
		d.add();
		d.add(10);
		
		ChildD cd = new ChildD();
		cd.add();//오버라이딩된 메소드호출
	}

}
