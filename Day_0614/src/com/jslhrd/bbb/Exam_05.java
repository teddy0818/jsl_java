package com.jslhrd.bbb;

public class Exam_05 {
	public static void main(String[] args) {
		MultiAB ab = new MultiAB();
		ab.method_01();
		ab.method_02();
		ab.method_03();
		ab.method_04();
		
		A_interface a = new MultiAB();
		a.method_01();
		a.method_02();
		
		B_interface b = new MultiAB();
		b.method_03();
		b.method_04();
	}

}
