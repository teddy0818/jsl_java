//n개의 데이터 입력(최대 10개),ㅣ -99는 입력종료

import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[10];
		int cnt=0;
		while(cnt<10) { //while(cnt<arr.length)
			System.out.print("입력:");
			arr[cnt] = scn.nextInt();
			if(arr[cnt]==-99) {
				break;
			}
			cnt++;		
		}
		System.out.print("배열내용:");
		for(int i=0; i<cnt; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
