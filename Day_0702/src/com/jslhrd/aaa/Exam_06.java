package com.jslhrd.aaa;
interface CC{
	int sum(int a, int b);
}
public class Exam_06 {
	public static void main(String[] args) {
		CC cc;
		cc = (a,b)->{
			int s = a + b;
			return s;
		};
		System.out.println(cc.sum(3, 5));
		
		cc = (a,b)-> {return a+b;};
		System.out.println(cc.sum(5, 10));
		
		cc = (a,b)-> a+b;
		System.out.println(cc.sum(10, 10));
		
		
	}

}
