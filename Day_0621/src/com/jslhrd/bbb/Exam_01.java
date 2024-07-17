package com.jslhrd.bbb;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_01 {
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
			
			Student stu = new Student();
			stu.setBun(bun);
			stu.setName(name);
			stu.setScore(score);
			process(stu);
		}//while(scn.hasNextLine()) 끝
	}//main()끝

	static void process(Student stu) {
		//최대, 최소, 합계, 평균
		int max = stu.getScore()[0];
		int min = stu.getScore()[0], sum = stu.getScore()[0];
		for(int i=1; i<5; i++) {
			if(max < stu.getScore()[i])
				max = stu.getScore()[i];
			else if(min > stu.getScore()[i])
				min=stu.getScore()[i];
			sum += stu.getScore()[i];
		}
		sum = sum - max - min;
		double ave = sum / 3.0;
		//출력
		System.out.print(stu.getBun() + "\t" + stu.getName() + "\t");
		for(int i=0; i<5; i++) {
			System.out.print(stu.getScore()[i] + "\t");
		}
		System.out.print(max + "\t" + min + "\t");
		System.out.print(sum + "\t" + String.format("%.2f", ave) + "\n");

	}
	
	
}
