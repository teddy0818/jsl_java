//3개의 정수를 입력 최대값, 최소값 찾기

import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 3개입력 :");
		int a= scn.nextInt();
		int b= scn.nextInt();
		int c= scn.nextInt();
		
		int max = a;
		if(max < b) {
			max =b;
		}
		if(max < c) {
			max=c;
		}
		System.out.printf("%d, %d, %d 중 최대값 %d\n", a,b,c,max);
		int min = a;
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		System.out.printf("%d, %d, %d 중 최소값 %d\n", a,b,c,min);
	}

}
