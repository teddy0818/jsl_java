package com.jslhrd.aaa;

public class DataProcess implements Process {
	@Override
	public int max(int a, int b) {
		int max=a;
		if(max<b) {
			max=b;
		}
		return max;
	}
	@Override
	public int min(int a, int b) {
		int min = (a>b) ? b : a;
		return min;
	}
	@Override
	public int max(int... a) {
		int max = a[0];
		for(int i=1; i<a.length;i++) {
			if(max < a[i]) {
				max=a[i];
			}
		}
		return max;

	}
	@Override
	public int min(int... a) {
		int min = a[0];
		for(int i=1; i<a.length;i++) {
			if(min > a[i]) {
				min=a[i];
			}
		}
		return min;
	}
}
