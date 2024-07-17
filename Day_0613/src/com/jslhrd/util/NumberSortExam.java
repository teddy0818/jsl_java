package com.jslhrd.util;

public class NumberSortExam extends NumberSort {
	NumberSortExam(int[] num){
		super(num);
	}
	
	@Override
	public void ascSort() {
		dataPrint();

	    int[] temp = number.clone(); // 배열 복제
	    for(int x=0; x<temp.length-1; x++) {
	    	for(int y=x+1; y<temp.length; y++) {
	    		if(temp[x]>temp[y]) {
	    			int imsi = temp[x];
	                temp[x] = temp[y];
	                temp[y] = imsi;
	    		}
	        }
	    }
	    System.out.print("Asc Sort : ");
	    for(int i=0; i<temp.length; i++) {
	    	System.out.print(temp[i]+"\t");
	    }
	    System.out.println();
	}
	@Override
	public void descSort() {
		dataPrint();

	    int[] temp = number.clone(); // 배열복제
	    for(int x=0; x<temp.length-1; x++) {
	    	for(int y=x+1; y<temp.length; y++) {
	    		if(temp[x]<temp[y]) {
	    			int imsi = temp[x];
	                temp[x] = temp[y];
	                temp[y] = imsi;
	    		}
	    	}
	    }
	    System.out.print("Desc Sort : ");
	    for(int i=0; i<temp.length; i++) {
	    	System.out.print(temp[i]+"\t");
	    }
	    System.out.println();
	}
	@Override
	public int maxMinTotla() {
		int max = number[0];
	    int min = number[0];
	    int tot = number[0];
	    for(int x=1; x<number.length; x++) {
	    	tot += number[x];
	        if(max<number[x]) {
	        	max=number[x];
	        }else if(min>number[x]) {
	        	min=number[x];
	        }
	    }
	    //System.out.println(tot-max-min);
	    return tot-max-min;
	}
}
