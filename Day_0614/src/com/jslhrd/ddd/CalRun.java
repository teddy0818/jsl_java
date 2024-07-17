package com.jslhrd.ddd;

public class CalRun {
	public static void main(String[] args) {
		Cal cal = new CalExam();
		cal.add(5, 9);
		//cal.addMulti(5,2,78,4,3,6,8);
		cal.div(10, 0);
		
		
		CalExam cx = new CalExam();
		cx.add(5, 9);
		cx.addMulti(5,2,78,4,3,6,8);
	}

}
