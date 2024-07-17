package com.jslhrd.bbb;
import java.util.*;
public class ScoreExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Map<Student, Score> sMap = new HashMap<Student, Score>();
		while(true) {
			System.out.print("입력:");
			String str[] = scn.nextLine().split(",");
			int hakbun = Integer.parseInt(str[0]);
			if(hakbun==0)
				break;
			String name = str[1];
			int kor = Integer.parseInt(str[2]);
			int eng = Integer.parseInt(str[3]);
			int mat = Integer.parseInt(str[4]);
			
			Student stu = new Student(hakbun,name);
			Score sco = new Score(kor,eng,mat);
			//중복검사
			if(sMap.containsKey(stu)) {
				System.out.println("이미등록된 학생입니다.");
				continue;
			}
			sMap.put(stu, sco);
		}
		
		//출력
		System.out.println("학번\t이름\t국어\t영어\t수학");
		Set<Map.Entry<Student, Score>> set = sMap.entrySet();
		Iterator<Map.Entry<Student, Score>> iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<Student, Score> entry = iter.next();
			System.out.print(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
