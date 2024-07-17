//키보드로 정수 2개입력 크기 비교하기

import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
/*		System.out.print("입력:");
		int a = scn.nextInt();
		System.out.print("입력:");
		int b = scn.nextInt();
*/
		System.out.print("입력:");
		int a= scn.nextInt();
		int b= scn.nextInt();
		if(a>b) {
			System.out.printf("%d, %d 중 큰값은 %d",a,b,a);
		}else {
			System.out.printf("%d, %d 중 같거나 %d가 크다",a,b,b);
		}
		System.out.println();
		if(a>b) {
			System.out.printf("%d, %d 중 큰값은 %d",a,b,a);
		}else if(a<b){
			System.out.printf("%d, %d 중 큰값은 %d",a,b,b);
		}else {
			System.out.printf("%d, %d 는 같다",a,b);
		}
		
	}

}
