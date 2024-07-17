package com.jslhrd.bbb;

import java.util.Scanner;

public class AlphaExam {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	    Alpha[] alpha = new Alpha[10];
	    int cnt=0;
	    while(true) {
	    	System.out.print("단어:");
	    	String str = scn.next().toUpperCase();
	    	if(str.equals("END")) {
	    		break;
	    	}
	    	alpha[cnt] = new Alpha(str);
	    	cnt++;
	    }
	    
	    AlphaData data = new AlphaData(alpha, cnt);
	    data.alphaPrint();
	}
}
