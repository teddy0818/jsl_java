package com.jslhrd.bbb;

import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    System.out.print("입력:");
	    String mem[] = scn.nextLine().split(",");

	    String gender="";//성별
	    int age=0;//나이

	    //주민번호에서 성별추출하기
	    String index = mem[1].substring(7);
	    //int cnt = mem[1].indexOf('-');
	    //String index2 = mem[1].charAt(cnt+1)+"";

	    //주민번호에서 년도 추출
	    String year = mem[1].substring(0,2);
	    //나이 및 성별 계산
	    //if("1256".contains(index2)){
	    if("1256".contains(index)) {
	    	age = 2024-(1900+Integer.parseInt(year));
	        if("15".contains(index)) {
	        	gender="남";
	        }else {
	        	gender="여";
	        }
	    }else {
	    	age = 2024-(2000+Integer.parseInt(year));
	        if("37".contains(index)) {
	        	gender="남";
	        }else {
	        	gender="여";
	        }
	    }
	    //출력
	    System.out.println("이름\t전화\t성별\t나이");
	    System.out.println(mem[0]+"\t"+mem[2]+"\t"
	    								+gender+"\t"+age);
	}
}
