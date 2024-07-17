package com.jslhrd.aaa;
public class Student {
	int bun;
	String name;
	public Student(int bun,String name) {
		this.bun=bun;
		this.name=name;
	}
	void stuPrint() {
		System.out.print(bun+"\t"+name+"\t");
	}
}
