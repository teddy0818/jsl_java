package com.jslhrd.aaa;

import java.util.Scanner;

class DD{
	int bun;
	String name;
	DD(int bun, String name){
		this.bun=bun;
		this.name=name;
	}
	@Override
	public String toString() {
		return bun + "\t" + name;
	}
}
public class Exam_05 {
	public static void main(String[] args) {
		String str = new String("AAAAA");
		System.out.println("str : " + str);
		
		DD dd = new DD(1,"aaaa");
		System.out.println("dd : " + dd);
		System.out.println("dd : " + dd.bun + "\t" + dd.name);
		
		
	}

}
