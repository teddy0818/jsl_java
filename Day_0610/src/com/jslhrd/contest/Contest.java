package com.jslhrd.contest;

public class Contest {
	private int c_no;//참가번호
	private String c_name;//참가자이름
	private int c_score[];//점수 7개
	private int c_max;//최대
	private int c_min;//최소
	private int c_tot;//합계
	private double c_ave;//평균
	private int c_rank;//순위

	//setter & getter
	public int getC_no() {
		return c_no;
	}
	public void setC_no(int c_no) {
		this.c_no = c_no;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int[] getC_score() {
		return c_score;
	}
	public void setC_score(int[] c_score) {
		this.c_score = c_score;
	}
	public int getC_max() {
		return c_max;
	}
	public void setC_max(int c_max) {
		this.c_max = c_max;
	}
	public int getC_min() {
		return c_min;
	}
	public void setC_min(int c_min) {
		this.c_min = c_min;
	}
	public int getC_tot() {
		return c_tot;
	}
	public void setC_tot(int c_tot) {
		this.c_tot = c_tot;
	}
	public double getC_ave() {
		return c_ave;
	}
	public void setC_ave(double c_ave) {
		this.c_ave = c_ave;
	}
	public int getC_rank() {
		return c_rank;
	}
	public void setC_rank(int c_rank) {
		this.c_rank = c_rank;
	}

	public Contest() {}
	
	public Contest(int c_no, String c_name, 
	                        int c_score[]) {
		this.c_no=c_no;
	    this.c_name=c_name;
	    this.c_score = c_score;
	      //최대, 최소, 합계, 평균 계산 메소드 호출
	    contestProcess();
	}
	//최대, 최소, 합계, 평균 계산
	private void contestProcess() {
		c_max = c_score[0];
	    c_min = c_score[0];
	    c_tot = c_score[0];
	    for(int i=1; i<7; i++) {
	    	if(c_max < c_score[i])
	    		c_max=c_score[i];
	    	else if(c_min > c_score[i])
	    		c_min=c_score[i];
	    	c_tot += c_score[i];
	    }
	    c_tot = c_tot - c_max-c_min;
	    c_ave = c_tot / 5.0;
	}

	//자신 출력 메소드
	public void contestPrint() {
		System.out.print(c_no + "\t" + c_name +"\t");
	    for(int i=0; i<7;i++) {
	    	System.out.print(c_score[i] + "\t");
	    }
	    System.out.print(c_max + "\t" + c_min +"\t");
	    System.out.print(c_tot + "\t" + c_ave +"\t" + 
	                                      c_rank + "\n");
	}  
}
