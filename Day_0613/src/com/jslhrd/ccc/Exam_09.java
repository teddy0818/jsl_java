package com.jslhrd.ccc;
abstract class SuperA{
	void add() {
		System.out.println("1 ~ 5 합 : 15");
	}
	abstract void add(int a, int b);
	abstract void mul(int a, int b);
}
class ChildA extends SuperA{
	@Override
	void add(int a, int b) {
		int result = a + b;
		System.out.printf("%d + %d = %d\n",a,b,result);	
	}
	@Override
	void mul(int a, int b) {
		int result = a * b;
		System.out.printf("%d * %d = %d\n",a,b,result);	
	}
}
class ChildB extends SuperA{
	@Override
	void add(int a, int b) {
		System.out.printf("%d + %d = %d\n",a,b,(a+b));		
	}
	@Override
	void mul(int a, int b) {
		System.out.printf("%d * %d = %d\n",a,b,(a*b));						
	}
}
class ChildC extends SuperA{
	@Override
	void add(int a, int b) {
		System.out.println(a + "+" + b + "=" + (a+b));					
	}
	@Override
	void mul(int a, int b) {
		System.out.println(a + "*" + b + "=" + (a*b));								
	}
}

public class Exam_09 {
	public static void main(String[] args) {
		SuperA a1 = new ChildA();
		a1.add(2,10);
		
		SuperA a2 = new ChildB();
		a2.add(1, 10);
		a2.mul(1, 5);
		
		SuperA a3 = new ChildC();
		a3.add(2, 7);
		a3.mul(1, 9);
	}

}
