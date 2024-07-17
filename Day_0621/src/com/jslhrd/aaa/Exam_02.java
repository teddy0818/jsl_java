package com.jslhrd.aaa;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_02 {
	public static void main(String[] args) throws Exception  {
		Scanner scn = new Scanner(new File("src/student.txt"));
		StringTokenizer st = null;
		//파일로부터 읽기
		while(scn.hasNextLine()) {
			String line = scn.nextLine();
			//System.out.println(line);
			st = new StringTokenizer(line,", ");
			int bun = Integer.parseInt(st.nextToken());//번호
			String name = st.nextToken();//이름
		/*
			int score1 = Integer.parseInt(st.nextToken());//점수1
			int score2 = Integer.parseInt(st.nextToken());//점수1
			int score3 = Integer.parseInt(st.nextToken());//점수1
			int score4 = Integer.parseInt(st.nextToken());//점수1
			int score5 = Integer.parseInt(st.nextToken());//점수1
		*/
			int score[] = new int[5];
			for(int i=0; i<5;i++) {
				score[i] = Integer.parseInt(st.nextToken());//점수
			}	
			
			process(bun,name,score);
		}//while(scn.hasNextLine()) 끝
	}//main()끝

	static void process(int bun,String name, int score[]) {
		//최대, 최소, 합계, 평균
		int max = score[0], min = score[0], sum = score[0];
		for(int i=1; i<5; i++) {
			if(max < score[i])
				max = score[i];
			else if(min > score[i])
				min=score[i];
			sum += score[i];
		}
		sum = sum - max - min;
		double ave = sum / 3.0;
		//출력
		System.out.print(bun + "\t" + name + "\t");
		for(int i=0; i<5; i++) {
			System.out.print(score[i] + "\t");
		}
		System.out.print(max + "\t" + min + "\t");
		System.out.print(sum + "\t" + String.format("%.2f", ave) + "\n");

	}
	
}
