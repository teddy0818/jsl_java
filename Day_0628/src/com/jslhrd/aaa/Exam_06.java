package com.jslhrd.aaa;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Exam_06 {
	public static void main(String[] args) {
		Map<Person, Integer> map = new HashMap<Person, Integer>();
		Person p = new Person(2,"bbb");
		map.put(p, 80);
		map.put(new Person(1,"aaa"), 90);
		map.put(new Person(3,"ccc"), 85);
		map.put(new Person(5,"ddd"), 78);
		map.put(new Person(4,"sss"), 95);
		map.put(new Person(1,"sss"), 80);

		System.out.println("번호\t이름\t점수");
		int tot = 0;//점수합계
		Set<Map.Entry<Person, Integer>> set = map.entrySet();
		Iterator<Map.Entry<Person, Integer>> iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<Person, Integer> entry = iter.next();
			System.out.print(entry.getKey() + "\t");
			System.out.print(entry.getValue() + "\n");
			tot += entry.getValue();
		}
		System.out.println("합계 : " + tot);
		
		
		
		
	}

}
