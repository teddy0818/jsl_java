package com.jslhrd.eee;

import java.io.IOException;

//예외처리(Exception)
public class Exam_01 {

	public static void main(String[] args) {
		System.out.print("1문자를 입력하세요");
		try {
			int x = System.in.read();
		}catch(Exception e) {
			System.out.println("예외가 발생");
			System.out.println("예외메시지 : " + e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("종료");
		}
		
	}

}
