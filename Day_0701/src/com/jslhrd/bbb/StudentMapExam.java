package com.jslhrd.bbb;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMapExam {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(new File("src/data.txt"));
		Map<Integer, Student> sMap = new HashMap();
		while(scn.hasNextLine()) {
			String[] str = scn.nextLine().split(",");
			int bun = Integer.parseInt(str[0]);
			String name = str[1];
			int kor = Integer.parseInt(str[2]);
			int eng = Integer.parseInt(str[3]);
			int mat = Integer.parseInt(str[4]);
			//키 중복검사
			//Student stu = new Student(name,kor,eng,mat);
			//총점, 평균, 등급
			//stu.getTot();
			if(sMap.containsKey(bun)) {
				System.out.println("중복된 키입니다.");
			}else {
				sMap.put(bun, new Student(name,kor,eng,mat));
			}
		}
		//개인별 총점,평균,등급
		//키값만 추출
		Set<Integer> keySet = sMap.keySet();
		for(Integer iter : keySet) {
			Student stu = sMap.get(iter);
			stu.setTot(stu.getKor()+stu.getEng()+stu.getMat());
			stu.setAve(stu.getTot()/3.0);
			stu.setGrade('F');
			if(stu.getAve()>=90)
				stu.setGrade('A');
			else if(stu.getAve()>=80)
				stu.setGrade('B');
			else if(stu.getAve()>=70)
				stu.setGrade('C');
			else if(stu.getAve()>=60)
				stu.setGrade('D');
		}
		//출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
		Set<Map.Entry<Integer, Student>> entrySet = sMap.entrySet();
		//번복자(Iterator) 변환
		Iterator<Map.Entry<Integer, Student>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Map.Entry<Integer, Student> entry = iter.next();
			System.out.print(entry.getKey()+"\t");//번호(키)
			//Student stu = entry.getValue();
			//System.out.print(stu.getName() + "\t");
			System.out.print(entry.getValue().getName() + "\t");
			System.out.print(entry.getValue().getKor() + "\t");
			System.out.print(entry.getValue().getEng() + "\t");
			System.out.print(entry.getValue().getMat() + "\t");
			System.out.print(entry.getValue().getTot() + "\t");
			System.out.print(entry.getValue().getAve() + "\t");
			System.out.print(entry.getValue().getGrade() + "\n");
		}
	}

}
