package com.jslhrd.contest;

import java.util.Scanner;

public class ContestProcess {
	private Contest contest[] = new Contest[10];
	private int cnt;
	   
	public ContestProcess() {}
	//등록메소드
	public void contestInput() {
		Scanner scn = new Scanner(System.in);
	    while(cnt<10) {
	    	System.out.print("참가자 등록:");
	        int c_no = scn.nextInt();
	        String c_name = scn.next();
	        if(c_no==0) {
	            contestRank();//입력종료시 순위계산메소드 호출
	            break;
	        }
	        //참가자 번호 중복체크
	        boolean flag=false;
	        for(int i=0; i<cnt; i++) {
	        	if(c_no==contest[i].getC_no()) {
	        		System.out.println("이미 등록된 참가자 입니다.");
	        		flag=true;
	        		break;
	            }
	        }
	        if(flag) { //중복된 참가자인 경우
	        	continue;
	        }
	        //중복된 참가자가 아닐경우
	        System.out.print("점수등록 :");
	        int score[] = new int[7];
	        for(int i=0; i<7; i++) {
	        	score[i] = scn.nextInt();
	        }
	        contest[cnt] = new Contest(c_no,c_name, score);
	        cnt++;
	    }
	}
	//순위 계산 메소드
	private void contestRank() {
	   
	}

	//출력용 부제목
	private void titleOutput() {
		System.out.print("참가번호\t이름\t점수1\t점수2\t점수3\t점수4\t");
	    System.out.print("점수5\t점수6\t점수7\t최대\t최소\t합계\t평균\t순위\n");
	}

	//전체 출력 메소드
	public void dataOutput() {
		titleOutput();//출력용 부제목메소드 호출
	    for(int i=0; i<cnt; i++) {
	    	contest[i].contestPrint();
	    }    
	}

	//순위 출력 메소드
	public void dataRankOutput() {
		//순위를 기준으로 정렬후 출력
	    rankSort();//오름차순 정열 메소드 호출
	    dataOutput();//전체출력 메소드 호출
	}
	//순위를 기준으로 정렬 메소드
	private void rankSort() {
		for(int i=0; i<cnt-1; i++) {
			for(int j=i+1; j<cnt; j++) { 
				if(contest[i].getC_rank() > 
	                               contest[j].getC_rank()) {
					Contest temp = contest[i];
	                contest[i] = contest[j];
	                contest[j] = temp;
	            }
			}
		}
	}
}
