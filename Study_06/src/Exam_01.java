import java.util.Scanner;

class Student{
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	//기능(메소드)
	void totAve() {
		int a=10;//지역
		tot=kor+eng+mat;
		ave=tot/3.0;
	}
	void stuPrint() {
		System.out.print(bun + "\t" + name + "\t");
		System.out.print(kor + "\t" + eng + "\t");
		System.out.print(mat + "\t" + tot + "\t");
		System.out.print(ave + "\n");
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		Student  st = new Student();
		int bun=10;
		Scanner scn = new Scanner(System.in);
		System.out.print("번호입력:");
		//int bun = scn.nextInt();
		st.bun=scn.nextInt();
		System.out.print("이름입력:");
		st.name=scn.next();
		System.out.print("국어입력:");
		st.kor=scn.nextInt();
		System.out.print("영어입력:");
		st.eng=scn.nextInt();
		System.out.print("수학입력:");
		st.mat=scn.nextInt();
		
		//st.tot=st.kor+st.eng+st.mat;
		//st.ave=st.tot/3.0;
		st.totAve();
		//출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		//System.out.print(st.bun + "\t" + st.name + "\t");
		//System.out.print(st.kor + "\t" + st.eng + "\t");
		//System.out.print(st.mat + "\t" + st.tot + "\t");
		//System.out.print(st.ave + "\n");
		st.stuPrint();

	}

}
