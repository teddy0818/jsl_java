import java.util.Arrays;

public class Exam_01 {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};//배열의 선언과동시 초기화
		System.out.println("a 배열내용 출력");
		//1. 배열내용확인
		System.out.println(Arrays.toString(a));
		//2. 배열 내용을 꺼내서 출력
		for(int i=0; i<a.length;i++) {
			System.out.printf("%3d",a[i]);
		}
		System.out.println();
		//3. 확장for() 이용한 배열 내용을 꺼내서 출력
		for(int i : a) {//10 20 30 40 50
			System.out.printf("%3d", i);
		}
		int arr[] = new int[10];//배열의 선언과동시 자동 초기화
		
	}

}
