package com.jslhrd.bbb;
import java.util.*;
//난수 발생 Random클래스, Math.random()
public class Lotto {
	//1. 배열이용
	public void arrayLotto() {
		Random r = new Random();
		int[] lotto = new int[6];
		for(int i=0; i<6; i++) {
			lotto[i] = r.nextInt(45)+1;
			//중복검사
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		//출력
		System.out.println("ArrayLotto : " + Arrays.toString(lotto));
		//정렬후 출력
		Arrays.sort(lotto);
		System.out.println("ArrayLotto Sort: " + Arrays.toString(lotto));
	}
	
	//2. List -> ArrayList 이용
	public void listLotto() {
		Random r = new Random();
		List<Integer> lotto = new ArrayList<Integer>();
		for(int i=0; i<6; i++) {
			int num = r.nextInt(45)+1;
			if(lotto.contains(num)) {
				i--;
			}else {
				lotto.add(num);
			}
		}
		//출력
		System.out.println("List Lotto : " + lotto);
		//정렬후 출력
		Collections.sort(lotto);
		System.out.println("List Lotto Sort : " + lotto);
	}
	
	//3. Set -> HashSet 이용
	public void setLotto() {
		Random r = new Random();
		Set<Integer> lotto = new HashSet<Integer>();
/*		//for()
		for(;lotto.size()<6;) {
			int num = r.nextInt(45)+1;
			lotto.add(num);
		}
*/		
		//while()
		while(lotto.size()<6) {
			int num = r.nextInt(45)+1;
			lotto.add(num);
		}	
		//출력
		System.out.println("Set Lotto : " + lotto);
		//정렬(set->list변환)
		List<Integer> setList = new ArrayList<Integer>(lotto);
		Collections.sort(setList);
		System.out.println("Set Lotto Sort: " + setList);
	}
	//4. 1~45번호 생성 후 섞어서 6개 뽑기
	public void examListLotto() {
		//Random r = new Random();
		List<Integer> lotto = new ArrayList<Integer>();
		for(int i=1; i<=45; i++) {
			lotto.add(i);
		}
		//번호섞기
		Collections.shuffle(lotto);
		
		//6개 뽑기
		int[] number = new int[6];
		for(int i=0; i<6; i++) {
			number[i] = lotto.get(i);
		}
		//출력
		System.out.println("ExamList Lotto : " + Arrays.toString(number));
		Arrays.sort(number);
		System.out.println("ExamList Lotto Sort: " + Arrays.toString(number));
		
	}
	
}
