package com.jslhrd.bbb;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_03 {
	public static void main(String[] args) throws Exception  {
		Scanner scn = new Scanner(new File("src/student.txt"));
		StringTokenizer st = null;
		StudentDAO dao = new StudentDAO();
		Student stu = null;
		//파일로부터 읽기
		while(scn.hasNextLine()) {
			String line = scn.nextLine();
			//System.out.println(line);
			st = new StringTokenizer(line,", ");
			stu = new Student();

			stu.setBun(Integer.parseInt(st.nextToken()));//번호
			stu.setName(st.nextToken());//이름
			int score[] = new int[5];
			for(int i=0; i<5;i++) {
				score[i] = Integer.parseInt(st.nextToken());//점수
			}
			stu.setScore(score);
			
			dao.process(stu);
			
		}//while(scn.hasNextLine()) 끝
	}//main()끝

	
	
}
