import java.util.Scanner;

class AA{
	int bun;
	String name;
	int age;
	
	void print() {
		System.out.println("번호 : " + bun);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("번호 이름 나이 : ");
		int b = scn.nextInt();
		String n = scn.next();
		int a = scn.nextInt();
		
		AA a1 = new AA();
		a1.bun=b;
		a1.name=n;
		a1.age=a;
		
		a1.print();
		
	}

}
