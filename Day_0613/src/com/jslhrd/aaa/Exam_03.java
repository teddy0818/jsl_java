package com.jslhrd.aaa;

public class Exam_03 {
	public static void main(String[] args) {
		//Student stu = new Student();
		Student stu = new Student(1,"김학생");
		stu.stuPrint();
		System.out.println("--------------------");
		Score sc = new Score(1,"이학생",57,89,90);
		sc.scorePrint();
		sc.scorePrint2();
		sc.stuPrint();
	}

}
