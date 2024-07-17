package com.jslhrd.aaa;
//기본자료형 읽기
import java.io.*;
public class Exam_04 {
	public static void main(String[] args) {
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream(
									new File("src/data.txt"))));
		}catch(Exception e) {
			e.printStackTrace();
		}
		int a=0;
		double b=0.0;
		byte[] by=null;
		try {
			a = dis.readInt();
			b = dis.readDouble();
			by = new byte[20];
			dis.read(by);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("a=" + a);
		System.out.println("b=" + a);
		System.out.println("by=" + new String(by));
	}

}
