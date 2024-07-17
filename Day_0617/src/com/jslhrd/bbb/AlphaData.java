package com.jslhrd.bbb;

public class AlphaData {
	Alpha[] alpha;
	int cnt;
	int[] count = new int[26];

	AlphaData(Alpha[] alpha, int cnt){
		this.alpha=alpha;
	    this.cnt=cnt;

	    alphaAccount();
	}

	private void alphaAccount() {
		for(int x=0; x<cnt; x++) {
			for(int k=0; k<alpha[x].getAlpha().length(); k++) {
				char ch = alpha[x].getAlpha().charAt(x);
	            count[ch-65]++;
			}
		}
	}
	public void alphaPrint() {
		for(int x=0; x<count.length;x++) {
			System.out.print((char)(x+65)+" ");
		}
		System.out.println();

		for(int x=0; x<count.length;x++) {
			System.out.print(count[x]+" ");
		}
		System.out.println();

		// 최대 발생 빈도수 찾기
		int max = count[0];
		char maxChar = (char)65;
		for(int x=1; x<count.length;x++) {
			if(max<count[x]) {
				max=count[x];
		        maxChar=(char)(x+65);
			}
		}
		System.out.println("최대사용된문자  : " +     
		                     maxChar+"("+max+")");
	}
}
