package com.jslhrd.aaa;
import java.util.*;
public class StudentExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Set<Student> stuSet = new HashSet<Student>();
		//입력
		while(true) {
			System.out.print("입력:");
			String line[] = scn.nextLine().split(",");
			int bun = Integer.parseInt(line[0]);
			if(bun==0){
				break;
			}
			String name = line[1];
			int kor = Integer.parseInt(line[2]);
			int eng = Integer.parseInt(line[3]);
			int mat = Integer.parseInt(line[4]);
			
			Student stu = new Student(bun,name,kor,eng,mat);
			
			if(!stuSet.add(stu)) {
				System.out.println("이미 등록된 학생입니다");
			}
/*			
			if(stuSet.contains(stu)) {
				System.out.println("이미 등록된 학생입니다");
			}else {
				stuSet.add(stu);
			}
*/			
			
		}//입력종료
		//총점, 평균 등급 계산
		for(Student s : stuSet) {
			s.setTot(s.getKor()+s.getEng()+s.getMat());
			
		}
		//출력(입력자료순)
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
		for(Student s : stuSet) {
			System.out.print(s.getBun() + "\t");
			
			
		}
		// 번호순으로 정렬
		
		//출력(번호순)
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
		for(Student s : stuSet) {
			System.out.print(s.getBun() + "\t");
			
			
		}
		
	}

}
