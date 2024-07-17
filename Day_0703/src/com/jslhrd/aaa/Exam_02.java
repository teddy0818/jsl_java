package com.jslhrd.aaa;
//파일로부터 읽기
import java.io.*;
public class Exam_02 {
	public static void main(String[] args) {
		try {
			File file = new File("src/test.txt");
			FileInputStream fis = new FileInputStream(file);
			byte[] by = new byte[1000];
			int count = fis.read(by);//읽어들인 byte수
			for(int i=0; i<count; i++){
				System.out.println(i + " : " + (char)by[i]);
				//System.out.println(i + " : " + by[i]);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
