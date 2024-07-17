package com.jslhrd.aaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//이름 최대 10명입력, 중복검사
public class Exam_03 {
	public static void main(String[] args) {
		List<String> sList = new ArrayList();
		Scanner scn = new Scanner(System.in);
		while(sList.size()<10) {
			System.out.print("입력:");
			String name = scn.next();
			if(sList.contains(name)) {
				System.out.println("중복");
			}else {
				sList.add(name);
				System.out.println("등록");
			}
		}
		//전체출력
		System.out.println("list : " + sList);
		//확장 for
		for(String str : sList) {
			System.out.print(str + "\t");
		}
		
	}

}
