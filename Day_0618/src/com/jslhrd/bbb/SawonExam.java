package com.jslhrd.bbb;

import java.util.Scanner;

public class SawonExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Sawon sawon[] = new Sawon[10];
		
		int cnt=0;
		for(cnt=0; cnt<10; cnt++) {
			System.out.print("사원입력:");
			String input = scn.nextLine();
			if(input.equals("9999")) {
				break;
			}
			String str[] = input.split(",");
			Sawon sa = new Sawon(str[0],str[1],
					str[2],str[3],Integer.parseInt(str[4]));
			sawon[cnt] = sa;
			//sawon[cnt] = new Sawon(str[0],str[1],
			//		str[2],str[3],Integer.parseInt(str[4]));
		}
		//출력
		int agetot=0;
		int paytot=0;
		System.out.println("사번\t이름\t생년월일\t\t나이\t성별\t급여");
		for(int i=0; i<cnt;i++) {
			sawon[i].sawonPrint();
			agetot += sawon[i].getAge();
			paytot += sawon[i].getPay();
		}
		System.out.println("평균나이 : " + agetot / cnt);
		System.out.println("평균급여 : " + paytot / cnt);
		System.out.println("--------------------------------------");
		System.out.println("사번\t이름\t생년월일\t\t나이\t성별\t급여");
		for(int i=0; i<cnt;i++) {
			System.out.print(sawon[i].getSabun() + "\t");
			System.out.print(sawon[i].getName() + "\t");
			System.out.print(sawon[i].getBirthStr() + "\t");
			System.out.print(sawon[i].getAge() + "\t");
			String strGender = (sawon[i].getGender().equalsIgnoreCase("m"))?"남자":"여자";
			System.out.print(strGender + "\t");
			System.out.print(sawon[i].getPay() + "\t");
		}
	}

}
