package com.jslhrd.bbb;

import java.util.Calendar;

//달력 Calendar
public class Exam_09 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);//년
		int month = cal.get(Calendar.MONTH)+1;//월
		//월(0월 ~ 11월)
		int date = cal.get(Calendar.DATE);//일
		int week = cal.get(Calendar.DAY_OF_WEEK);//요일
		//요일은 1:일요일 ~ 7:월요일)
		String weekday="";
		switch(week) {
		case 1:
			weekday="일요일"; 	break;
		case 2:
			weekday="월요일";		break;
		case 3:
			weekday="화요일";		break;
		case 4:
			weekday="수요일";		break;
		case 5:
			weekday="목요일";		break;
		case 6:
			weekday="금요일";		break;
		case 7:
			weekday="토요일";		break;
		}
		
		System.out.printf("오늘은 %d년 %d월 %d일 %s입니다\n",
							year,month,date,weekday);
	}

}
