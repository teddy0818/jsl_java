package com.jslhrd.aaa;
//함수적 인터페이스 :
@FunctionalInterface//어노테이션
interface AA{
	//int add(int m);
	void test();
}
public class Exam_04 {
	public static void main(String[] args) {
		AA aa;
		aa = () -> {
			String str = "Hello World";
			System.out.println("str= " + str);
		};
		aa.test();
		
		aa = () -> { System.out.println("Hello World 2 !");};
		aa.test();

		aa = () -> System.out.println("Hello World 3 !");
		aa.test();

	}

}

