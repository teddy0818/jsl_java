package com.jslhrd.aaa;
//Setter & Getter : 캡슐화(정보은닉)
public class BB {
	private int bun;
	private String name;
	private int age;
	public BB() {}
	public BB(int bun,String name, int age) {
		this.bun=bun;
		this.name=name;
		this.age=age;
	}
	
	public int getBun() {
		return bun;
	}
	public void setBun(int bun) {
		this.bun = bun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
