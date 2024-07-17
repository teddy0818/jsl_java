package com.jslhrd.aaa;
interface BB{
	void add(int num);
}
public class Exam_05 {
	public static void main(String[] args) {
		BB bb;
		bb = (num)-> {
			int res =0;
			for(int i=1; i<=num; i++)
				res += i;
			System.out.println("1 ~ 5 합 : " + res);
		};
		bb.add(5);
		
	}

}
