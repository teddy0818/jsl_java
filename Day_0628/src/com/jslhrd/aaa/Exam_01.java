package com.jslhrd.aaa;
import java.util.*;
public class Exam_01 {
	public static void main(String[] args) {
/*		Map map = new HashMap();//key:Object, value : Object
		map.put("aaa", 90);
		map.put(1, 90);
		map.put(3.14, "aaa");
		map.put('A', 90);
*/
		Map<String, Integer> map = new HashMap<String, Integer>();
		//map.put(1, 90);//불가
		System.out.println("map이 비어있는가?" + map.isEmpty());
		map.put("A", 90);
		map.put("B", 80);
		map.put("C", 70);
		map.put("A", 60);
		map.put("D", 90);
		System.out.println("mpa : " + map);
		System.out.println("객체 수 : " + map.size());//5
		System.out.println("키 A 값 : " + map.get("A"));//60
		System.out.println("키 B 포함 : " + map.containsKey("B"));
		System.out.println("값 90 포함 : " + map.containsValue(90));
		
		
		

	}

}
