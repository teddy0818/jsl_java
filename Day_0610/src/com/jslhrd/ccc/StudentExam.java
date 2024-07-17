package com.jslhrd.ccc;

import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) {
		StudentProcess stuPro = new StudentProcess();
	    Scanner scn = new Scanner(System.in);
	    while(true) {
	    	System.out.println("학생관리 프로그램");
	        System.out.println("[1] 학생등록");
	        System.out.println("[2] 입력자료순 출력");
	        System.out.println("[3] 성적순 출력");
	        System.out.println("[4] 프로그램 종료");
	        System.out.print("메뉴 선택 ? ");

	        int sw = scn.nextInt();
	        switch(sw) {
	        	case 1:  //입력
	        		stuPro.stuInput();
	        		break;
	            case 2: //입력자료순 출력
	            	stuPro.stuPrint();
	            	break;
	            case 3: //점수 순으로 출력
	            	stuPro.stuSort();
	            	break;
	            case 4:
	                System.out.println("프로그램을 종료 합니다.");
	                System.exit(0);//종료
	            default:
	                System.out.println("입력오류");
	        }
	    }
	}
}
