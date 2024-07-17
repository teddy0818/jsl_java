package com.jslhrd.bbb;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_02 {
	public static void main(String[] args) throws Exception  {
		Scanner scn = new Scanner(new File("src/student.txt"));
		StringTokenizer st = null;
		StudentDAO dao = new StudentDAO();
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
			
			dao.process(stu);
			
		}//while(scn.hasNextLine()) 끝
	}//main()끝

	
	
}
