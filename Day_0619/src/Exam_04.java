import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		while(true) {
			System.out.print("10진수 : ");
			int dec = scn.nextInt();
			if(dec == -99) 
				break;
			//진법변환
			sb.delete(0, sb.length());
			
			int temp = dec;
			do {
				int mok = temp / 2;
				int na = temp % 2;
				sb.insert(0, na);
				temp = mok;
			}while(temp != 0);
			System.out.printf("10진수 %d는 2진수 %s입니다\n", dec,sb);
		}
	}

}
