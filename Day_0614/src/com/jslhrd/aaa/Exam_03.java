package com.jslhrd.aaa;

public class Exam_03 {
	public static void main(String[] args) {
		int a=7, b=5;
		Process pro = new DataProcess();
		
		int result = pro.max(a, b);
		System.out.printf("%d, %d max = %d\n",a,b,result);
		
		result = pro.min(a, b);
		System.out.printf("%d, %d min = %d\n",a,b,result);
		
		result = pro.max(1,2,3,4,5);
		System.out.printf("1,2,3,4,5 max = %d\n",result);
		
		result = pro.min(new int[]{5,4,3,2,1});
		System.out.printf("5,4,3,2,1 min = %d\n",result);

		DataProcess pro2 = new DataProcess();
		
		result = pro2.max(a, b);
		System.out.printf("%d, %d max = %d\n",a,b,result);
		
		result = pro2.min(a, b);
		System.out.printf("%d, %d min = %d\n",a,b,result);
		
		result = pro2.max(1,2,3,4,5);
		System.out.printf("1,2,3,4,5 max = %d\n",result);
		
		result = pro2.min(new int[]{5,4,3,2,1});
		System.out.printf("5,4,3,2,1 min = %d\n",result);

		
	}

}
