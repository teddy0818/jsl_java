package com.jslhrd.aaa;
interface EE{
	int max(int[] num);
}
public class Exam_08 {
	public static void main(String[] args) {
		EE e = (num) -> {
			int max = num[0];
			for(int i=1; i<num.length; i++) {
				if(max < num[i])
					max = num[i];
			}
			return max;
		};
		
		int a[] = {3,6,8,3,9,4,5,6};
		int mx = e.max(a);
		System.out.println(mx);
		
	}

}
