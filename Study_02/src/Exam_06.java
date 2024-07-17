import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i=0;
		int s=0;
		System.out.print("입력:");
		while(true) {
			int a = scn.nextInt();
			if(a<=0) {
				continue;
			}
			i++;
			s += a;
			if(i==5) {
				break;
			}
		}
		System.out.print(s);
	}

}
