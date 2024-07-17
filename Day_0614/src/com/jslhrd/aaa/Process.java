package com.jslhrd.aaa;

public interface Process {
	//2개의 정수중 최대값 반환
	int max(int a, int b);
	
	//2개의 정수중 최소값 반환
	int min(int a, int b);
	
	//n개의 정수중 최대값 반환
	int max(int ... a);
	
	//n개의 정수중 최소값 반환
	int min(int ... a);
}
