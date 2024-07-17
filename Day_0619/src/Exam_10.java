import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_10 {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(new File("data.txt"));
		StringTokenizer st = null;
		System.out.println("번호\t이름\t국어\t영어\t수학");
		while(scn.hasNextLine()) {
			String str = scn.nextLine();
			st = new StringTokenizer(str,", ");
			int bun = Integer.parseInt(st.nextToken());//번호
			String name = st.nextToken();//이름
			String kor = st.nextToken();//국어
			String eng = st.nextToken();//영어
			String mat = st.nextToken();//수학
			
			System.out.print(bun + "\t" + name + "\t");
			System.out.print(kor + "\t" + eng + "\t" + mat + "\n");
		}
	}

}
