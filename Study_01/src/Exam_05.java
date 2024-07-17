/* 키보드로 정수 4개 입력 최대, 초서값을 차아서 출력
 * [입력형식]
 * 정수 1 : 90
 * 정수 2 : 70
 * 정수 3 : 85
 * 정수 4 : 95
 * 
 * 최대값 : 95
 * 최소값 : 70
 * 
 */

import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 1 :");
		int a = scn.nextInt();
		System.out.print("정수 2 :");
		int b = scn.nextInt();
		System.out.print("정수 3 :");
		int c = scn.nextInt();
		System.out.print("정수 4 :");
		int d = scn.nextInt();
		
		int max=a, min=a;
		if(max < b) {
			max = b;
		}else if(min > b) {
			min = b;
		}
		if(max < c) {
			max = c;
		}else if(min > c) {
			min = c;
		}
		if(max < d) {
			max = d;
		}else if(min > d) {
			min = d;
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}

}
