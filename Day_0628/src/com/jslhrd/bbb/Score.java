package com.jslhrd.bbb;
public class Score {
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double ave;
	
	public Score(int kor,int eng,int mat) {
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	
	@Override
	public String toString() {
		return kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+ave;
	}
}
