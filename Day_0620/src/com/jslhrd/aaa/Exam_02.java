package com.jslhrd.aaa;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_02 {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(new File("src/student.txt"));
		StringTokenizer st = null;
		int cnt=0;//인원수 카운트
		int ktot=0,etot=0,mtot=0,ttot=0;
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
		while(scn.hasNextLine()) {
			st = new StringTokenizer(scn.nextLine(),",");
			int bun = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int mat = Integer.parseInt(st.nextToken());
			
			int tot = kor + eng + mat;
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
			System.out.print(bun + "\t" + name + "\t");
			System.out.print(kor + "\t" + eng + "\t");
			System.out.print(mat + "\t" + tot + "\t");
			//System.out.print(ave + "\t" + grade + "\n");
			System.out.print(String.format("%.1f", ave) + "\t" + grade + "\n");
			//카운트
			cnt++;
			ktot += kor;
			etot += eng;
			mtot += mat;
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
