package com.jslhrd.homework;

import java.io.Serializable;

public class Student implements Serializable, Comparable<Student> {
	private int bun;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double ave;
	private String grade;
	
	public Student() {}
	
	public Student(int bun, String name, int kor, int eng, int mat) {
		this.bun=bun;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		this.tot = kor + eng + mat;
		this.ave = Math.round((this.tot / 3.0) * 100.0) / 100.0;
		if(this.ave>=90) {
			this.grade = "A";
		} else if(this.ave>=80) {
			this.grade = "B";
		} else if(this.ave>=70) {
			this.grade = "C";
		} else if(this.ave>=60) {
			this.grade = "D";
		} else {
			this.grade = "F";
		}
		
	}

	@Override
	public int hashCode() {
		return bun;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return bun==s.bun;
		}else {
			return false;
		}
	}
	
	@Override
	public int compareTo(Student o) {
		return Integer.compare(bun, o.bun);
	}

	public int getBun() {
		return bun;
	}

	public void setBun(int bun) {
		this.bun = bun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAve() {
		return ave;
	}

	public void setAve(double ave) {
		this.ave = ave;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}


}
