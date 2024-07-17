//배열에 저장된 데이터 이용

import java.util.Arrays;

public class Exam_04 {
	public static void main(String[] args) {
		int a[]= {5,9,3,6,4,2,8,5,7};
		//배열데이터 출력
		System.out.println("a 배열 내용 : " + Arrays.toString(a));
		System.out.print("a 배열 내용 : ");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
		//배열내용 출력 후 합계출력
		int s=0;
		System.out.print("a 배열 내용 : ");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
			s += a[i];
		}
		System.out.print(s + "\n");
	}

}
