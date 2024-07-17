class AA{
	static int x;
	int y;
	void print() {
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
	static void test() {
		System.out.println("x=" + x);
		//System.out.println("y=" + y);
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		AA.x=100;
		AA.test();
		
		AA a1 = new AA();
		a1.y=200;
		AA a2 = new AA();
		a2.y=300;
		a2.x=1000;
		System.out.println("a1.x = " + a1.x);
		System.out.println("a2.x = " + a2.x);
	}

}
