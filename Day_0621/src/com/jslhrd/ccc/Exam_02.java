package com.jslhrd.ccc;

import java.time.*;

public class Exam_02 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println("now = " + now);
		LocalTime time = LocalTime.now();
		System.out.println("time = " + time);
	
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("datetime = " + datetime);
	}

}
