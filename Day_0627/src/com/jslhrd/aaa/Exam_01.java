package com.jslhrd.aaa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Exam_01 {
	public static void main(String[] args) {
		//Set set = new Set();
		Set<String> set = new HashSet();
		HashSet<String> set2 = new HashSet();
		boolean bool = set.add("BBBB");
		System.out.println(bool);
		
		bool = set.add("BBBB");
		System.out.println(bool);
		
		set.add("Java");set.add("JSLHRD");
		set.add("Servlet");set.add("DataBase");
		// 확인
		System.out.println("set : " + set);
		
		//출력 확장 for()
		System.out.print("확장 for : ");
		for(String str : set) {
			System.out.print(str + "\t");
		}
		System.out.println();//줄바꿈
		//출력 반복자(Iterator 인터페이스로 변환)
		System.out.print("Iterator 변환 : ");
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + "\t");
		}
		System.out.println();//줄바꿈
		//List로 변환=> sort 자동
		List<String> list = new ArrayList(set);
		System.out.println("list : " + list);
		Collections.sort(list);//정렬
		System.out.println("list : " + list);
		
	}

}
