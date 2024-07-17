package com.jslhrd.aaa;
import java.util.*;
public class Exam_02 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "기학생");map.put(2, "오학생");
		map.put(3, "강학생");map.put(6, "박학생");
		map.put(4, "박학생");map.put(7, "홍학생");
		map.put(5, "기학생");map.put(8, "최학생");
		System.out.println("map : " + map);
		int cnt = map.size();//객체수
		//키값만 반환
		Set<Integer> keySet = map.keySet();
		//확장 for
		for(Integer key : keySet) {
			System.out.print(key + " : " );
			System.out.println(map.get(key));
		}
		//키값을 반복자로 변환 : Iterator
		System.out.println("---------------------");
		Set<Integer> keySet2 = map.keySet();
		Iterator<Integer> iter = keySet2.iterator();
		while(iter.hasNext()) {
			Integer key = iter.next();
			System.out.print(key + " : " );
			System.out.println(map.get(key));			
		}
		
		
	}

}
