import java.util.Arrays;
import java.util.Scanner;
//n개의 데이터 입력(최대 10개),ㅣ -99는 입력종료
public class Exam_02 {
	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner scn = new Scanner(System.in);
		int cnt;//데이터 수 카운트
		for(cnt = 0; cnt<10; cnt++) {
			System.out.print((cnt+1)+":입력 ?");
			arr[cnt] = scn.nextInt();
			if(arr[cnt]==-99) {
				break;
			}
		}
		//System.out.println("배열 내용 : " + Arrays.toString(arr));
		System.out.print("배열 내용 : ");
		for(int i=0; i<cnt; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
