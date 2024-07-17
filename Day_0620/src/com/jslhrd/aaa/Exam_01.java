package com.jslhrd.aaa;

import java.io.File;
import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(new File("src/student.txt"));
/*		//줄수(인원수)
		int cnt=0;
		while(scn.hasNextLine()) {
			scn.nextLine();
			cnt++;
		}
*/
		int cnt=0;//인원수 카운트
		int ktot=0,etot=0,mtot=0,ttot=0;
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
		while(scn.hasNextLine()) {
			String stu[] = scn.nextLine().split(",");
			int tot = Integer.parseInt(stu[2]) +
					Integer.parseInt(stu[3]) + 
					Integer.parseInt(stu[4]);
			//int kor = Integer.parseInt(stu[2]);
			//int eng = Integer.parseInt(stu[3]);
			//int mat = Integer.parseInt(stu[4]);
			//int tot = kor + eng + mat;
			double ave = tot / 3.;
			String grade="F";
			if(ave>=90) 
				grade="A";
			else if(ave>=80) 
				grade="B";
			else if(ave>=70) 
				grade="C";
			else if(ave>=60) 
				grade="D";
			
			//출력
			System.out.print(stu[0] + "\t" + stu[1] + "\t");
			System.out.print(stu[2] + "\t" + stu[3] + "\t");
			System.out.print(stu[4] + "\t" + tot + "\t");
			//System.out.print(ave + "\t" + grade + "\n");
			System.out.print(String.format("%.1f", ave) + "\t" + grade + "\n");
			//카운트
			cnt++;
			ktot += Integer.parseInt(stu[2]);
			//ktot += kor;
			etot += Integer.parseInt(stu[3]);
			mtot += Integer.parseInt(stu[4]);
			ttot += tot;
		}//while(scn.hasNextLine())끝
		System.out.println("전체총점 : \t" + ktot + "\t" + etot + "\t" +
							mtot + "\t" + ttot);
		System.out.print("전체평균 : \t");
		System.out.print(String.format("%.1f", (double)ktot/cnt) + "\t");
		System.out.print(String.format("%.1f", (double)etot/cnt) + "\t");
		System.out.print(String.format("%.1f", (double)mtot/cnt) + "\t");
		System.out.print(String.format("%.1f", (double)ttot/(cnt*3)) + "\n");
		
	}

}
