package com.jslhrd.bbb;

import java.util.Arrays;
import java.util.Comparator;

//Arrays
public class Exam_07 {
	public static void main(String[] args) {
		int arr[] = {5,3,9,7,6,2,3};
		System.out.println("배열 내용 : " + Arrays.toString(arr));
		//배열복제
		int cpArr[] = arr.clone();
		System.out.println("cpArr배열 내용 : " + Arrays.toString(cpArr));
		int arr2[] = Arrays.copyOf(arr, arr.length);
		System.out.println("arr2배열 내용 : " + Arrays.toString(arr2));
		
		//배열 정렬
		Arrays.sort(arr);//기본자료형, String-> 오름차순
		System.out.println("정렬후 배열 내용 : " + Arrays.toString(arr));
		
		//내림차순
		Integer arr3[] = {5,3,9,7,6,2,3};
		Arrays.sort(arr3, Comparator.reverseOrder());
		System.out.println("내림정렬후 배열 내용 : " + Arrays.toString(arr3));
	}

}
