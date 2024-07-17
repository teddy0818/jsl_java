import java.io.*;
import java.util.*;

public class Exam_08 {
	public static void main(String[] args) throws Exception {
		//키보드로부터 입력
		Scanner scn = new Scanner(System.in);
		
		//파일로부터 입력
		Scanner scnf = new Scanner(new File("data.txt"));
		while(scnf.hasNextLine()) {
			String str = scnf.nextLine();
			System.out.println(str);
		}
		System.out.println("--------------------");
		Scanner scnf2 = new Scanner(new File("src/name.txt"));
		while(scnf2.hasNext()) {
			String s = scnf2.next();
			System.out.println(s);
		}
	}

}
