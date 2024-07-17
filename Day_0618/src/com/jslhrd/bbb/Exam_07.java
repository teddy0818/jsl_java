package com.jslhrd.bbb;

import java.util.Scanner;

/* (사원번호, 이름, 생년월일, 성별, 급여)    
  사원입력 :1101,홍길동, 19900206, M, 789790
  사원번호  이름       생년월일         나이    성별     급여
  1101    홍길동    1990년02월06일    31      남      789790
 */
public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("사원입력:");
		String str = scn.nextLine();
		String arr[] = str.split(",");
		//String arr[] = scn.nextLine().split(",");
		int sabun = Integer.parseInt(arr[0]);//사번
		String name = arr[1];
		String birth = arr[2];
		String strBirth = birth.substring(0,4)+"년" + 
				birth.substring(4,6)+"월" + 
				birth.substring(6)+"일";
		int age = 2024-Integer.parseInt(birth.substring(0,4));
		String gender = arr[3];
		String strGender ="여자";
		if(gender.equalsIgnoreCase("m")) {
			strGender ="남자";
		}
		int pay = Integer.parseInt(arr[4]);
		
		System.out.println("사번\t이름\t생년월일\t\t나이\t성별\t급여");
		System.out.print(sabun+"\t" + name + "\t");
		System.out.print(strBirth+"\t" + age + "\t");
		System.out.print(strGender+"\t" + pay + "\n");
	}

}
