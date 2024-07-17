package com.jslhrd.bbb;
import java.io.File;
//파일로부터 읽기(Scanner)
import java.util.Scanner;
public class Exam_08 {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(new File("src/student.txt"));
		
		//파일로부터 읽기
		String data[] = null;
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		while(scn.hasNextLine()) {
			data = scn.nextLine().split(",");
			System.out.print(data[0] + "\t");
			System.out.print(data[1] + "\t");
			System.out.print(data[2] + "\t");
			System.out.print(data[3] + "\t");
			System.out.print(data[4] + "\t");
			int tot = Integer.parseInt(data[2]) +
					Integer.parseInt(data[3]) +
					Integer.parseInt(data[4]);
			double ave = tot / 3.0;
			System.out.print(tot + "\t");
			System.out.print(String.format("%.2f", ave) + "\n");
			
		}
	}

}
