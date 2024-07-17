package com.jslhrd.aaa;
// 바이트 데이터 파일 저장
import java.io.*;
public class Exam_01 {
	public static void main(String[] args) {
		File file = new File("src/test.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			byte[] data = {66,68,70,72,(byte)'!'};
			fos.write(data);
			fos.close();
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없음");
			e.printStackTrace();
		}catch(IOException ee) {
			System.out.println("파일입출력 에러 발생");
			ee.printStackTrace();
		}
		System.out.println("실행끝!");
		

	}

}
