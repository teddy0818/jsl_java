//배열, 반복, 제어

import java.util.Arrays;
import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.print("입력:");
		for(int i=0; i<arr.length;i++) {
			//System.out.print("입력:");
			arr[i] = scn.nextInt();
		}
		System.out.println("arr :" + Arrays.toString(arr));
		
		
	}

}
