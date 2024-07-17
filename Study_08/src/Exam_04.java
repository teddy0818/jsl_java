import java.util.Scanner;

class BB{
	int bun;
	String name;
	int age;
	
	BB(int b,String n, int a){
		bun=b;
		name=n;
		age=a;
	}
	void print() {
		System.out.println("번호 : " + bun);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("번호 이름 나이 :");
		int b=scn.nextInt();
		String n = scn.next();
		int a = scn.nextInt();
		
		//BB b1 = new BB();
		BB b1 = new BB(b,n,a);
		b1.print();
		
				
		
	}

}
