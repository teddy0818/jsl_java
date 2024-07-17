package com.jslhrd.ccc;

import java.util.Scanner;

public class StudentProcess {
	Student student[] = new Student[10];
	int cnt;
	public void stuInput() {
		Scanner scn = new Scanner(System.in);
	    Student stu = null;
	    while(cnt < 10) {
	    	System.out.print("입력 : ");
	        String hakbun = scn.next();
	        if(hakbun.equals("0000")) {
	        	return;
	        }
	        String name = scn.next();
	        String gender = scn.next();
	        int score = scn.nextInt();
	        //중복검사
	        boolean flag=true;
	        for(int i=0; i<cnt; i++) {
	        	if(student[i].getHakbun().equals(hakbun)) {
	        		System.out.println("이미등록된 학생입니다");
	        		flag=false;
	        		break;
	            }
	        }
	        if(flag) {
	        	stu = new Student(hakbun,name,gender,score);
	            student[cnt]=stu;
	            cnt++;
	        }
	    }
	}
	//입력자료순 출력
	public void stuPrint() {
		System.out.println("학번\t이름\t성별\t점수");
		for(int i=0; i<cnt; i++) {
			student[i].stuPrint();
		}
	}

	//점수를 기준으로 내림 차순정렬
	public void stuSort() {
		Student stu[] = student.clone();
		for(int i=0; i<cnt-1; i++) {
			for(int j=i+1; j<cnt; j++) {
				if(stu[i].getScore() < stu[j].getScore()) {
					Student temp = stu[i];
		            stu[i] = stu[j];
		            stu[j] = temp;
				}
			}
		}
		System.out.println("점수를 기준으로 내림 차순 정렬");
		System.out.println("학번\t이름\t성별\t점수");
			for(int i=0; i<cnt; i++) {
				stu[i].stuPrint();
			}
		}
}
