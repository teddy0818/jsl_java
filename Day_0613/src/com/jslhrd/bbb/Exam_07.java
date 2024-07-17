package com.jslhrd.bbb;
class AAA{
	
}
class SubAAA extends AAA{
	
}
public class Exam_07 {
	static void exam01(AAA a) {
		SubAAA sa = (SubAAA) a;
		System.out.println("SubAAA로 변환성공");
	}
	static void exam02(AAA a) {
		if(a instanceof SubAAA) {
			SubAAA sa = (SubAAA)a;
			System.out.println("SubAAA로 변환성공");
		}else {
			System.out.println("SubAAA로 변환불가");
		}
	}
	
	public static void main(String[] args) {
		AAA aa = new AAA();
		//exam01(aa);
		exam02(aa);
		System.out.println("------------------");

		AAA aaa = new SubAAA();
		exam01(aaa);
		exam02(aaa);
		
	}

}
