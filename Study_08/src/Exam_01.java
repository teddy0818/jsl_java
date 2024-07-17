import java.util.Scanner;

class Student{
	private int bun;
	private String name;
	private int age;
	
	Student(){}
	Student(int bun,String name,int age){
		this.bun=bun;
		this.name=name;
		this.age=age;
	}
	
	public int getBun() {
		return bun;
	}
	public void setBun(int bun) {
		this.bun = bun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("번호:");
		int b = scn.nextInt();
		System.out.print("이름:");
		String na = scn.next();
		System.out.print("나이:");
		int a = scn.nextInt();
		
		Student st1 = new Student();
		st1.setBun(b);
		st1.setName(na);
		st1.setAge(a);
		//st1.bun=b;
		//st1.name=na;
		//st1.age=a;
		System.out.println("번호 : " + st1.getBun());
		System.out.println("이름 : " + st1.getName());
		System.out.println("나이 : " + st1.getAge());
		
		System.out.println("------------------------");
		Student st2 = new Student(b,na,a);
		System.out.println("번호 : " + st2.getBun());
		System.out.println("이름 : " + st2.getName());
		System.out.println("나이 : " + st2.getAge());
		

				
	}

}
