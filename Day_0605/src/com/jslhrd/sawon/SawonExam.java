package com.jslhrd.sawon;

import java.util.Scanner;

public class SawonExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Sawon sawon[] = new Sawon[10];
		int cnt;//사원수 카운트
		for(cnt=0; cnt<10;cnt++) {
			System.out.print("사원정보:");
			int sabun = scn.nextInt();//사원번호
			if(sabun==9999) {
				break;
			}
			String name = scn.next();//이름
			int gender = scn.nextInt();//성별(1/2)
			int grade = scn.nextInt();//등급
			int time = scn.nextInt();//근무시간
			sawon[cnt] = new Sawon(sabun,name,gender,grade,time);
			sawon[cnt].sawonAccount();
		}
		System.out.println(cnt);
		//출력
		int payTot=0;//급여합계
		System.out.println("사원번호\t이름\t성별\t등급\t시급\t근무시간\t주간급여");
		for(int i=0; i<cnt;i++) {
			sawon[i].sawonPrint();
			payTot += sawon[i].wekPay;
		}
		System.out.println("총 주간급여 : " + payTot);
	}

}
