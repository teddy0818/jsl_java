package com.jslhrd.aaa;
/* 람다식(Lambda) : 메서드를 하나의 식으로 표현
 * 메소드이름, 반환타입 생략
 */
interface Test{
	public void add();
}
class TestExam implements Test{
	@Override
	public void add() {
		System.out.println("Hello");
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		Test t = new TestExam();
		t.add();

		//익명구현객체
		Test tt = new Test() {
			@Override
			public void add() {
				System.out.println("Hello");
			}
		};
		tt.add();
		
		//람다식
		Test ttt=()->System.out.println("Hello");
		ttt.add();
		
	}

}
