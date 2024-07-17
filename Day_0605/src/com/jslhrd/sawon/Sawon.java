package com.jslhrd.sawon;

public class Sawon {
	int sabun; //사번
    String name; //이름
    int gender; //성별(1/2)
    String strGender; //성별(남/여)
    int grade; //등급
    int time; //근무시간
    int timePay; //시급
    int wekPay; //주간급여
    public Sawon(int sabun,String name,int gender,int grade,int time) {
    	this.sabun=sabun;
    	this.name=name;
    	this.gender=gender;
    	this.grade=grade;
    	this.time=time;
    }
    //사원급여계산
    void sawonAccount() {
    	strGender = "여자";
    	if(gender==1) {
    		strGender="남자";
    	}
    	//시급
    	timePay = 2000;
    	if(grade==1) {
    		timePay=10000;
    	}else if(grade==2) {
    		timePay=5000;
    	}
    	//주간급여
    	int overTime=0;//초과근무시간
        int baseTime = time;
        if(baseTime>50) {
           baseTime=50;
        }
        if(baseTime>36) {
           overTime=baseTime-36;
           baseTime=36;
        }
        //주간급여 계산
        wekPay = baseTime*timePay+(int)(overTime*timePay*1.5);
    }
    //정보출력 메소드
    void sawonPrint() {
    	System.out.print(sabun + "\t" + name + "\t");
    	System.out.print(strGender + "\t" + grade + "\t"+ timePay + "\t");
    	System.out.print(time + "\t" + wekPay + "\n");
    }
}
