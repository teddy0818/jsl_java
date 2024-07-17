import java.util.Scanner;

class Person{
	int bun;
	String name;
	int age;
}

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("번호 이름 나이 :");
		int bun = scn.nextInt();
		String name = scn.next();
		int age = scn.nextInt();
		
		Person p1 = new Person();
		p1.bun=bun;
		p1.name=name;
		p1.age=age;
		
		System.out.println("번호 :" + p1.bun);
		System.out.println("이름 :" + p1.name);
		System.out.println("나이 :" + p1.age);
	}

}
