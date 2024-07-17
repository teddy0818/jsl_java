import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int array[] = new int[10];

	    // 입력 단계
	    for(int i=0; i<10; i++) {
	    	System.out.print("data "+ (i+1) + ":");
	        array[i] = scn.nextInt();
	    }

	    // 출력단계
	    System.out.print("Input Data : ");
	    for(int i=0; i<10; i++) {
	    	System.out.print(array[i]+"\t");
	    }
	    System.out.println();
	    
	    //총점, 평균, 최대, 최소출력
	    int max=array[0];
	    int min=array[0];
	    int tot=array[0];
	    for(int i=1; i<10; i++) {
	    	tot += array[i];//총점계산
	        if(max<array[i]) {//최대
	        	max=array[i];
	        }else if(min>array[i]) {//최소
	        	min=array[i];
	        }
	    }
	    double ave = tot / 10.;//반올림 처리

	    System.out.println("합계 : " + tot);
	    System.out.println("평균 : " + ave);
	    System.out.println("최대값 : " + max);
	    System.out.println("최소값 : " + min);
	}
}
