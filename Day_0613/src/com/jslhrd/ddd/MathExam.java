package com.jslhrd.ddd;

public abstract class MathExam {
	   //두 개의 정수 중 큰수 반환
	   public abstract int max(int a, int b);

	   //두 개의 정수 중 작은수 반환
	   public abstract int min(int a, int b);

	   //여러 개의 정수 중 큰수 반환
	   public abstract int max(int ... a);

	   //여러 개의 정수 중 작은 반환
	   public abstract int min(int ... a);

}
