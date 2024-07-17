import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i=0;
		int s=0;
		System.out.print("입력:");
		while(i<5) {
			int a = scn.nextInt();
			if(a<=0) {
				continue;
			}
			i++;
			s+=a;
		}
		System.out.print(s);
	}

}
