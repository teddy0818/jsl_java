package com.jslhrd.aaa;

import java.util.*;

public class Exam_03 {
	public static void main(String[] args) {
		Set<Person> pSet = new HashSet();
		Person p = new Person(1,"aaa",30);
		boolean bool = pSet.add(p);
		System.out.println("1. 추가유무 : " + bool);
		
		p = new Person(2,"aaa",30);
		bool = pSet.add(p);
		System.out.println("2. 추가유무 : " + bool);
		
		p = new Person(2,"aaa",30);
		bool = pSet.add(p);
		System.out.println("3. 추가유무 : " + bool);

	}

}
