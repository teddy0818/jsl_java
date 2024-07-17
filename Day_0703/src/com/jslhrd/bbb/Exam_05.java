package com.jslhrd.bbb;
//텍스트 파일 출력
import java.io.*;
public class Exam_05 {
	public static void main(String[] args) throws Exception{
		File f = new File("src/output.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.print("1. 파일에 쓰기");
		pw.print("다시 파일에 쓰기");
		pw.println();
		pw.println("2. 파일에 쓰기");
		pw.println("3. File Writer");
		pw.println("4. 1234567890");
		
		pw.close();
		
		
	}

}
