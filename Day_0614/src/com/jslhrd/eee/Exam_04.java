package com.jslhrd.eee;

import java.beans.Expression;

class Sawon2{
	String name;
	
	void print() throws Exception {
		if(name.equals("aaa")) {
			System.out.println("name=" + name);
		}else {
			System.out.println("name=null");			
		}
	}
	void print2() {
		if(name != null) {
			System.out.println("name=" + name);
		}else {
			System.out.println("name=null");			
		}
	}
	
}

public class Exam_04 {
	public static void main(String[] args) {
		Sawon2 sa = new Sawon2();
		try {
		sa.print();
		//sa.print2();
		}catch(Exception e) {
			
		}
	}

}
