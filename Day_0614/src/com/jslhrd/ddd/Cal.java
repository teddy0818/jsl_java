package com.jslhrd.ddd;
//계산기 기본기능 명시
public interface Cal {
	void add(int a, int b);//덧셈
	void sub(int a, int b);//뺄셈
	void mul(int a, int b);//곱셈
	void div(int a, int b);//나눗셈
	void rem(int a, int b);//나머지
}
