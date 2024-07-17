package com.jslhrd.bbb;
public class Sawon {
	private String sabun;//사번
	private String name;//이름
	private String birth;//생년월일 : 900509
	private String birthStr;//00년 00월 00일
	private int age;
	private String gender;//성별(m/f)
	private int pay;//급여
	
	public String getSabun() {
		return sabun;
	}
	public void setSabun(String sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getBirthStr() {
		return birthStr;
	}
	public void setBirthStr(String birthStr) {
		this.birthStr = birthStr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public Sawon() {}
	public Sawon(String sabun,String name,String birth,String gender,int pay) {
		this.sabun=sabun;
		this.name=name;
		this.birth=birth;
		this.gender=gender;
		this.pay=pay;
		birthStr();
	}
	private void birthStr() {
		//int year = Integer.parseInt(birth.substring(0,5));
		String year = birth.substring(0,4);
		String month = birth.substring(4,6);
		String date = birth.substring(6);
		birthStr = year+"년"+month+"월"+date+"일";
		
		age = 2024-Integer.parseInt(year);//나이
	}
	
	public void sawonPrint() {
		String strGender = (gender.equalsIgnoreCase("m"))?"남자":"여자";
		System.out.print(sabun + "\t" + name + "\t");
		System.out.print(birthStr + "\t" + age + "\t");
		System.out.print(strGender + "\t" + pay + "\n");
		
	}
}
