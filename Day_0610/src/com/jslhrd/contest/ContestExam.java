package com.jslhrd.contest;

import java.util.Scanner;

public class ContestExam {
	public static void main(String[] args) {
		ContestProcess conPro = new ContestProcess();
	    Scanner scnn = new Scanner(System.in);
	    while(true) {
	    	System.out.println("[ 1 ] 참가자등록 ");
	        System.out.println("[ 2 ] 입력자료순 출력 ");
	        System.out.println("[ 3 ] 순위(성적)순 출력 ");
	        System.out.println("[ 4 ] 프로그램종료 ");
	        System.out.print("메뉴선택(1 ~ 5) ? ");
	        int menu = scnn.nextInt();
	        switch(menu) {
            	case 1:
                   //입력 메소드 호출
            		conPro.contestInput();    
            		break;
            	case 2:
                  //입력 자료순 출력
            		conPro.dataOutput();  
            		break;
            	case 3:
                  //성적순 출력
            		conPro.dataRankOutput();  
            		break;
            	case 4:
            		//종료
            		System.exit(0);
            	default:
            		System.out.println("입력오류");
	        }
	    }
	}
}
