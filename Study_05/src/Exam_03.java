import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner scn = new Scanner(System.in);
		int cnt=0;//실제 입력 데이터수 카운트
		System.out.print("데이터 입력:");
		while(cnt<10) {
			arr[cnt] = scn.nextInt();
			if(arr[cnt]==0) {
				break;
			}
			cnt++;
		}
		System.out.println("입력자료수 : " + cnt);
		System.out.print("자료출력:");
		for(int i=0; i<cnt; i++) {
			System.out.print(arr[i] + "\t");
		}
/*		
		System.out.println();
		System.out.print("자료출력:");
		for(int x: arr) {
			System.out.print(x + "\t");
		}
*/		
	}

}
