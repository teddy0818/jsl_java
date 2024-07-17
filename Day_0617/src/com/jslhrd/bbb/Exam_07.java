package com.jslhrd.bbb;

import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int chArr[] = new int[26];// 0:A,1:B,2:C
	    while(true) {
	    	System.out.print("단어입력:");
	        String str = scn.next().toUpperCase();
	        if(str.equals("END"))
	        	break;
	        for(int i=0; i<str.length(); i++) {
	        	char ch = str.charAt(i);//문자열 분리
	            //배열 인덱스 구하기
	            int index = ch-65;
	            chArr[index]++;
	        }
	    }//while()끝 
	    //출력 테스트
	    for(char ch ='A'; ch<='Z'; ch++) {
	    	System.out.printf("%3c", ch);
	    }
	    System.out.print("\n");

	    for(int i=0; i<chArr.length;i++){
	    	System.out.printf("%3d", chArr[i]);
	    }
	    System.out.print("\n");

	    //문자 발생 빈도수 찾기
	    int max = chArr[0];
	    char maxChar='A';
	    for(int i=1; i<chArr.length; i++) {
	    	if(max < chArr[i]) {
	    		max = chArr[i];
	    		maxChar = (char)(i+65);
	    	}
	    }
	    System.out.println("최대 발생 문자 : " + 
	                        maxChar + "("+ max + ")");
	}
}
