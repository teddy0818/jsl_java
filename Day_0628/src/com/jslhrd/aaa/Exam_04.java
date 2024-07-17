package com.jslhrd.aaa;
import java.util.*;
public class Exam_04 {
	public static void main(String[] args) {
		Map<Person, Integer> map = new HashMap<Person, Integer>();
		Person p = new Person(2,"bbb");
		map.put(p, 80);
		map.put(new Person(1,"aaa"), 90);
		map.put(new Person(3,"ccc"), 85);
		map.put(new Person(5,"ddd"), 78);
		map.put(new Person(4,"sss"), 95);
		map.put(new Person(1,"sss"), 80);
		//System.out.println(map);
		System.out.println("번호\t이름\t점수");
		Set<Person> keySet = map.keySet();
		for(Person per : keySet) {
			System.out.print(per);
			//System.out.print(per.getBun() + "\t");
			//System.out.print(per.getName() + "\t");
			System.out.println(map.get(per));
		}
		
	}

}
