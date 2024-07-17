import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    System.out.print("줄수입력 :");
	    int m = scn.nextInt();
	    int cnt=0;
	    for(int i=1; i<=m; i++) {
	    	for(int k=1; k<=m-i; k++) {
	    		System.out.printf("%3s"," ");
	        }
	        for(int j=1; j<=i*2-1; j++) {
	        	cnt++;
	            System.out.printf("%3d", cnt);
	        }
	        System.out.print("\n");
	    }
	}
}
