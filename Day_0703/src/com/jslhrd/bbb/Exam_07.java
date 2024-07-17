package com.jslhrd.bbb;
//키보드입력 파일 출력
/* 키보드로 번호,이름,국어,영어,수학 입력
 * 
 */
import java.util.*;
import java.io.*;
public class Exam_07 {
	public static void main(String[] args) throws Exception{
		//키보드입력
		Scanner scn = new Scanner(System.in);
	
		//파일출력을 위한 준비
		PrintWriter pw = 
				new PrintWriter(
						new BufferedWriter(
								new FileWriter(
										new File("src/sungjuk.txt"))));
		
		pw.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		//입력
		while(true) {
			System.out.print("성적입력:");
			String str[] = scn.nextLine().split(",");
			if(str[0].equals("-99"))
				break;
			//총점
			int tot = Integer.parseInt(str[2]) +
					Integer.parseInt(str[3]) +
					Integer.parseInt(str[4]);
			double ave = tot / 3.0;
			//파일출력
			pw.print(str[0] + "\t");
			pw.print(str[1] + "\t");
			pw.print(str[2] + "\t");
			pw.print(str[3] + "\t");
			pw.print(str[4] + "\t");
			pw.print(tot + "\t");
			pw.print(ave + "\n");
		}//while(true)끝
		pw.close();
		
	}

}
