//정적멤버와 정적메소드==>정적(static)
class A{
	int a=10;
	void test() {
		//a=100;
		System.out.println("a=" + a);
	}
}
class B{
	static int a=10;//정적멤버변수
	
}
public class Exam_01 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.test();
		a1.a=100;
		a1.test();
		
		System.out.println("B-> a =" + B.a);
		B b1 = new B();
		b1.a=100;
		System.out.println("B-> a =" + B.a);
	}

}
