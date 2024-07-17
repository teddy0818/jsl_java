package com.jslhrd.ccc;

public class Member implements Comparable<Member>{
	private int bun;
	private String name;
/*	//문자열
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);//오름차순
		//return o.name.compareTo(name);//내림차순
	}
*/	
	//숫자
	@Override
	public int compareTo(Member o) {
		return Integer.compare(bun, o.bun);//오름차순
		//return Integer.compare(o.bun, bun);//내림차순
	}

	@Override
	public String toString() {
		return bun + "\t" + name;
	}
	
	public Member(int bun,String name) {
		this.bun=bun;
		this.name=name;
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
}
