package com.jslhrd.aaa;

import java.util.Scanner;

interface DD{
	int add(int n, int m);//n~ m까지 합계 반환
}
public class Exam_07 {
	public static void main(String[] args) {
		//람다식 작성
		DD d = (n,m) -> {
			int s=0;
			for(int i=n; i<=m; i++)
				s += i;
			return s;
		};
		//키보드로 n,m 입력
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		int result = d.add(a, b);
		System.out.printf("%d ~ %d 합 = %d",a,b,result);
		
	}

}
