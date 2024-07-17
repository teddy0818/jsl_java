package com.jslhrd.aaa;
import java.util.*;
public class Exam_03 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("F", 90);map.put("S", 75);
		map.put("A", 95);map.put("R", 90);
		map.put("D", 85);map.put("K", 95);
		map.put("C", 80);map.put("B", 88);
		//점수 합계, 평균
		Collection<Integer> values = map.values();
		System.out.println("values : " + values);
		System.out.println("values : " + values.size());
		int tot =0;
		for(Integer var : values) {
			tot += var;
		}
		System.out.println("점수 합계 : " + tot);
		System.out.println("점수 평균 : " + tot/map.size());
		// 이름   점수 
		// A      90
		//키값만 분리
		Set<String> setKey = map.keySet();
		int sum=0;
		System.out.println("이름\t점수");
		for(String key : setKey) {
			System.out.print(key + "\t");
			int score = map.get(key);
			sum += score;
			System.out.print(score + "\n");
		}
		System.out.println("점수 합계 : " + sum);
		System.out.println("점수 평균 : " + sum/map.size());
		
		
	}

}
