import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int[] score=null;
	    while(true) {
	    	System.out.print("수치입력(1 ~ ?) ");
	        int var = scn.nextInt();
	        if(var==0)
	        	break;
	        score = new int[var];
	        for(int x=0; x<100; x++) {
	        	int num = (int)(Math.random()*var)+1;
	            score[(num-1)]++;
	        }

	        System.out.println("=== 결과 출력 ===");
	        for(int x=0; x<score.length;x++) {
	        	System.out.print((x+1)+" : " );
	            for(int y=0; y<score[x];y++) {
	            	System.out.print("*");
	            }
	            System.out.println("("+score[x]+")");
	        }
	        //빈도수 계산
	        
	    }
	}
}
