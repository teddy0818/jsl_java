package com.jslhrd.aaa;
//추상클래스 : 미완성 설계도
//인터페이스 : 명세서, 기본설계도 : 추상메소드로 구성
interface AA{
	//static final int a=10;//상수
	int a=10;
/*	void abc() {
		
	}
*/
	public abstract void test();
	public int add();
}
interface AAA extends AA{
	
}
class SubAA implements AA{//구현클래스
	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void test() {
			// TODO Auto-generated method stub
			
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		//AA a = new AA();//생성불가
		
		SubAA sa = new SubAA();
		AA aa = new SubAA();
		
	}

}
