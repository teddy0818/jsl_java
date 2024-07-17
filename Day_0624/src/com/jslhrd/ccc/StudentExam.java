package com.jslhrd.ccc;
import java.util.*;
public class StudentExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Student> sList = new ArrayList<Student>();
		while(true) {
			System.out.print("학생등록:");
			String str[] = scn.nextLine().split(",");
			int bun = Integer.parseInt(str[0]);
			if(bun==0)
				break;
			String name = str[1];
			int kor = Integer.parseInt(str[2]);
			int eng = Integer.parseInt(str[3]);
			int mat = Integer.parseInt(str[4]);
/*			Student stu = new Student();
			stu.setBun(bun);
			stu.setName(name);
			stu.setKor(kor);
			stu.setEng(eng);
			stu.setMat(mat);
*/
			Student stu = new Student(bun,name,kor,eng,mat);
			//총점, 평균, 등급
			//stu.setTot(kor+eng+mat);
			stu.setTot(stu.getKor()+stu.getEng()+stu.getMat());
			stu.setAve(stu.getTot()/3.0);
			
			//stu.setGrade("가");
			if(stu.getAve()>=90)
				stu.setGrade("수");
			else if(stu.getAve()>=80)
				stu.setGrade("우");
			else if(stu.getAve()>=70)
				stu.setGrade("미");
			else if(stu.getAve()>=60)
				stu.setGrade("양");
			else
				stu.setGrade("가");
			//리스트에 추가
			sList.add(stu);
		}//while(true)끝
		
		//출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t판정");
		for(int i=0; i<sList.size();i++) {
			Student s = sList.get(i);
			System.out.print(s.getBun() + "\t");
			System.out.print(s.getName() + "\t");
			System.out.print(s.getKor() + "\t");
			System.out.print(s.getEng() + "\t");
			System.out.print(s.getMat() + "\t");
			System.out.print(s.getTot() + "\t");
			System.out.print(String.format("%.2f",s.getAve()) + "\t");
			System.out.print(s.getGrade() + "\n");
			
			//System.out.print(sList.get(i).getBun() + "\t");
			//System.out.print(sList.get(i).getName() + "\t");
			//System.out.print(sList.get(i).getKor() + "\t");
		}
	}//main()끝

}
