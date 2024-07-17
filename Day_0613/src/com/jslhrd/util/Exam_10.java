package com.jslhrd.util;

import java.util.Scanner;

public class Exam_10 {
	public static void main(String[] args) {
		int[] score = new int[100];
	    Scanner scn = new Scanner(System.in);
	    int cnt=0;
	    System.out.print("정수입력 : ");
	    while(cnt<100) {
	    	score[cnt] = scn.nextInt();
	        if(score[cnt]==0)
	        	break;
	        cnt++;
	    }

	    //입력 데이터수 만큼 새로운 배열 생성
	    int[] number = new int[cnt];
	    for(int x=0; x<cnt; x++) {
	    	number[x] = score[x];
	    }

	    NumberSort ns = new NumberSortExam(number);
	    ns.ascSort();
	    ns.descSort();
	    int tot = ns.maxMinTotla();
	    System.out.print("합계(최대-최소) : " + tot);
	}
}
