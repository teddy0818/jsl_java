package com.jslhrd.ddd;

public class CalExam implements Cal{
	@Override
	public void add(int a, int b) {
		System.out.printf("%d + %d = %d\n",a,b,(a+b));
	}
	//추가(n개의 데이터 덧셈)
	public void addMulti(int ... a) {
		int s=0;
		for(int i=0; i<a.length;i++) {
			s += a[i];
			if(i==a.length-1) {
				System.out.print(a[i] + "=");
			}else {
				System.out.print(a[i] + "+");
			}
		}
		System.out.println(s);
	}
	@Override
	public void sub(int a, int b) {
		int res = a-b;
		System.out.printf("%d - %d = %d\n",a,b,res);
	}
	@Override
	public void mul(int a, int b) {
		int res = a*b;
		System.out.printf("%d * %d = %d\n",a,b,res);
	}
	@Override
	public void div(int a, int b) {
		if(b==0) {
			System.out.println("0으로 나눌수 없음");
			return;
		}
		int res = a/b;
		System.out.printf("%d / %d = %d\n",a,b,res);
	}
	@Override
	public void rem(int a, int b) {
		int res = a%b;
		System.out.printf("%d %% %d = %d\n",a,b,res);	
	}
	
}
