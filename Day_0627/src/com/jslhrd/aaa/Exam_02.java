package com.jslhrd.aaa;

import java.util.*;

public class Exam_02 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		//비어 있는지 검사
		System.out.println("set이 비어 있는가 ? " + set.isEmpty());
		set.add(55);set.add(75);
		set.add(45);set.add(95);
		set.add(85);set.add(60);
		System.out.println("자료수 : " + set.size());
		//45포함 유무
		if(set.contains(45)) {
			System.out.println("45 포함");
		}else {
			System.out.println("45 미포함");	
		}
		
		//특정 객체 제거
		set.remove(45);
		System.out.println("자료수 : " + set.size());
		//모두제거
		set.removeAll(set);
		if(set.isEmpty()) {
			System.out.println("set이 비어있음");
		}
	}

}
