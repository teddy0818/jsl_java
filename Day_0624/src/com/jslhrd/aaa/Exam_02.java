package com.jslhrd.aaa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exam_02 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		//list.add("aaa");
		list.add(90);
		list.add(60);
		list.add(40);
		list.add(30);
		list.add(70);
		//출력 테스트
		System.out.println("list = " + list);
		//
		for(int i=0; i<list.size();i++) {
			int a = list.get(i);
			System.out.println(a);
			//System.out.println(list.get(i));
		}
		//리스트을 반복자로 변환
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//확장 for
		for(Integer a : list) {
			System.out.println(a);
		}
		//합계
		int tot=0;
		for(int i=0; i<list.size();i++) {
			int b = list.get(i);
			tot += b;
		}
		System.out.println("tot + " + tot);
	}

}
