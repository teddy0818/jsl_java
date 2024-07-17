package com.jslhrd.ccc;

public interface MathPro {
	int sum(int n, int m);// n~ m까지 합계 반환
	 
	String binaryStr(int num); // 10진수을 2진수로 변환 반환 
	
	int[] binaryArr(int num); // 10진수을 2진수로 변환 반환

	void priNumber(int num);// 2~ num까지 소수를 구하여 출력

	void numberScore(int ... values);// 점수중에서 최대, 최소, 합계를 구하여 출력

}
