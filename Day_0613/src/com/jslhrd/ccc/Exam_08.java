package com.jslhrd.ccc;
//추상클래스: 미완성 클래스
abstract class S{
	int a;
	void test(){}
}
abstract class SSS{
	int k;
	abstract int add();
}
abstract class A{
	int bun;
	String name;
	void print() {
		System.out.println(bun + "\t" + name + "\t");
	}
	abstract void exam();//추상메소드
	abstract void add(int a, int b);
}
class SubA extends A{
	@Override
	void add(int a, int b) {
				
	}
	@Override
	void exam() {
		
		
	}
	
}
class SubS extends S{
	
}
public class Exam_08 {
	public static void main(String[] args) {

	}

}
