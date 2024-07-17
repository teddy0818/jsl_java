package com.jslhrd.bbb;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class UserCalendar {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        System.out.print("년도 입력 :");
        int year = scn.nextInt();
        System.out.print("월 입력 :");
        int month = scn.nextInt();

        System.out.println("\t" + "\t" + "[ " + year + "년 " + month + "월" + " ]");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        // 년, 월을 구함(달 정보는 1월에 0이 나오기 때문에 +1)
        Calendar calendar = new GregorianCalendar(year, (month - 1), 1);
        // 마지막 날을 구함
        int maxday = calendar.getActualMaximum((calendar.DAY_OF_MONTH));  
        //1 일요일, 2 월요일, ... // 요일를 구함
        int week = calendar.get(Calendar.DAY_OF_WEEK);  

        for (int i = 1; i < week ; i++) {       
             System.out.print("\t");
        }
        for (int i = 1;i <= maxday; i++) {
            if (week <= 7) {
                 System.out.print(i + "\t");
            } else {
                 System.out.println();   
                 // week가 7보다 커지면 다시 일요일로   
                 System.out.print(i + "\t");  
                 week = 1; // 다시 일요일부터 시작     
            }
             week++;      
        }
	}
}
