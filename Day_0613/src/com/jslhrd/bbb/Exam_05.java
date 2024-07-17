package com.jslhrd.bbb;
class ParentA{
	
}
class ChildA extends ParentA{
	
}
public class Exam_05 {
	public static void main(String[] args) {
		ParentA a1 = new ParentA();
		ParentA a2 = new ParentA();
		if(a1==a2) {
			System.out.println("a1과 a2는 같은 객체임");
		}else {
			System.out.println("a1과 a2는 다른 객체임");
		}
		//instanceof ==> 변수 instanceof 클래스
		if(a1 instanceof ParentA) {
			System.out.println("a1과 a2는 같은 객체임");
		}else {
			System.out.println("a1과 a2는 다른 객체임");
		}
		
	}

}
