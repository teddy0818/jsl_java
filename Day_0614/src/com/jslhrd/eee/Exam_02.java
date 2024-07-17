package com.jslhrd.eee;
class AA{
	void div(int a, int b) {
		try {
			int res = a/b;
			System.out.println(res);
		}catch(ArithmeticException ae) {
			//System.out.println(e.getMessage());
			//System.out.println("0으로 나눌수 없습니다.");
			ae.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		AA a = new AA();
		a.div(10, 0);
	}

}
