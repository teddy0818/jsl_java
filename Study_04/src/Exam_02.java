import java.util.Arrays;

public class Exam_02 {
	public static void main(String[] args) {
		char ch[]= {'a','s','d','f','g'};
		System.out.println("ch : " + Arrays.toString(ch));
		System.out.print("ch : ");
		for(int i=0; i<ch.length;i++) {
			System.out.printf("%3c", ch[i]);
		}
		System.out.print("\n");
		System.out.print("ch : ");
		for(char c : ch) {
			System.out.printf("%3c", c);
		}
		System.out.print("\n");
		String str[] = {"Lee","Kim","Kang","Oh","Pass"};
		System.out.print("str : ");
		for(String s : str) {
			System.out.printf("%5s", s);
		}
	}

}
