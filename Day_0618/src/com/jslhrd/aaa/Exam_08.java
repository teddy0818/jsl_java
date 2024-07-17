package com.jslhrd.aaa;

import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		Person per[] = new Person[3];
		Scanner scn = new Scanner(System.in);
		for(int i=0; i<3;i++) {
			System.out.print("등록:");
			String str[] = scn.nextLine().split(",");
			Person p1 = new Person(Integer.parseInt(str[0]),str[1],str[2]);
			per[i] = p1;
		}
		System.out.println("번호\t이름\t성별");
		for(int i=0;i<3;i++) {
			System.out.println(per[i]);
		}
	}

}
