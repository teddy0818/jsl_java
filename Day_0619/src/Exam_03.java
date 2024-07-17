import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("10진수 : ");
			int dec = scn.nextInt();
			if(dec == -99) 
				break;
			//진법변환
			String bin="";
			int temp = dec;
			while(temp != 0) {
				int mok = temp / 2;
				int na = temp % 2;
				bin = na + bin;
				temp = mok;
			}
			System.out.printf("10진수 %d는 2진수 %s입니다\n", dec, bin);
		}
	}

}
