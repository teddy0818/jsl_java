package com.jslhrd.aaa;

public class Exam_02 {
	public static void main(String[] args) {
		BB bb1 = new BB();
		bb1.setBun(1);
		bb1.setName("aaa");
		bb1.setAge(30);
		System.out.println("번호 : " + bb1.getBun());
		System.out.println("이름 : " + bb1.getName());
		System.out.println("나이 : " + bb1.getAge());
		
		//bb1.bun=1;
		//bb1.name="aaa";
		//bb1.age=25;
		
		BB bb2 = new BB(3,"bbb", 30);
		System.out.println("번호 : " + bb2.getBun());
		System.out.println("이름 : " + bb2.getName());
		System.out.println("나이 : " + bb2.getAge());
	}

}
