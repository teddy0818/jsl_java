package com.jslhrd.bbb;
class SuperA{
	
}
class SuperB{
	
}
/* 다중 상속은 지원하지 않음
class SubA extends SuperA, SuperB{
	
}
*/
interface InterA{
	
}
interface InterB{
	
}
class SubInter implements InterA, InterB{
	
}

class SubAA extends SuperA implements InterA,InterB{
	
}

public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
