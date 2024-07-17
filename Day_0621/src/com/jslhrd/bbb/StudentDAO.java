package com.jslhrd.bbb;

public class StudentDAO {
	void process(Student stu) {
		//최대, 최소, 합계, 평균
		int max = stu.getScore()[0];
		int min = stu.getScore()[0], sum = stu.getScore()[0];
		for(int i=1; i<5; i++) {
			if(max < stu.getScore()[i])
				max = stu.getScore()[i];
			else if(min > stu.getScore()[i])
				min=stu.getScore()[i];
			sum += stu.getScore()[i];
		}
		sum = sum - max - min;
		double ave = sum / 3.0;
		//출력
		System.out.print(stu.getBun() + "\t" + stu.getName() + "\t");
		for(int i=0; i<5; i++) {
			System.out.print(stu.getScore()[i] + "\t");
		}
		System.out.print(max + "\t" + min + "\t");
		System.out.print(sum + "\t" + String.format("%.2f", ave) + "\n");

	}

}
