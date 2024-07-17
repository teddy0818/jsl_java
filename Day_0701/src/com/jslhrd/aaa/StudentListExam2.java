package com.jslhrd.aaa;
import java.io.File;
import java.util.*;
public class StudentListExam2 {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(new File("src/data.txt"));
		List<Student> sList = new ArrayList<Student>();
		while(scn.hasNextLine()) {
			String str[] = scn.nextLine().split(",");
			int bun = Integer.parseInt(str[0]);
			String name = str[1];
			int kor = Integer.parseInt(str[2]);
			int eng = Integer.parseInt(str[3]);
			int mat = Integer.parseInt(str[4]);
			
			Student stu = new Student(bun,name,kor,eng,mat);
			//리스트에 추가
			sList.add(stu);
		}//while(true) 끝
/*
		//개인별 총점,평균,등급 계산
		for(int i=0; i<sList.size();i++) {
			sList.get(i).setTot(sList.get(i).getKor() + 
								sList.get(i).getKor() + 
								sList.get(i).getKor());
			sList.get(i).setAve(sList.get(i).getTot()/3.0);
			//등급계산
			
		}
*/		
		//개인별 총점,평균,등급 계산
		for(int i=0; i<sList.size();i++) {
			Student stu = sList.get(i); 
			stu.setTot(stu.getKor()+stu.getEng()+stu.getMat());
			stu.setAve(stu.getTot()/3.0);
			if(stu.getAve()>=90) 
				stu.setGrade('A');
			else if(stu.getAve()>=80) 
				stu.setGrade('B');
			else if(stu.getAve()>=70) 
				stu.setGrade('C');
			else if(stu.getAve()>=60) 
				stu.setGrade('D');
			else
				stu.setGrade('F');			
		}
		
		//출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
		for(Student stu : sList) {
			System.out.print(stu.getBun() + "\t");
			System.out.print(stu.getName() + "\t");
			System.out.print(stu.getKor() + "\t");
			System.out.print(stu.getEng() + "\t");
			System.out.print(stu.getMat() + "\t");
			System.out.print(stu.getTot() + "\t");
			System.out.print(String.format("%.2f",stu.getAve()) + "\t");
			System.out.print(stu.getGrade() + "\n");
		}
	}

}
