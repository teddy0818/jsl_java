//학생 기본 정보 클래스
public class Student {
	int bun;//번호
	String name;//이름
	int[] score;//점수배열을 이용할 경우
	int score1,score2,score3,score4,score5;
	int mxScore, mnScore;//점수최대, 최소    
	int tot;//총점
	double ave;//평균
	int rank;//순위

	public Student() {}

	public Student(int bun, String name, int score1,
					int score2,int score3,int score4,int score5) {
		this.bun=bun;             this.name=name;
	    this.score1=score1;    this.score2=score2;
	    this.score3=score3;    this.score4=score4;
	    this.score5=score5;    
	    account();
	}
	//점수 배열을 이용할 경우
	public Student(int bun, String name, int ... score) {
		this.bun=bun;            
		this.name=name;
	    this.score = score;
	    accountArr();
	}
	//최대,최소, 합계 평균
	void account() {
		System.out.println("account() Call");
	    mxScore = score1;
	    mnScore = score1;
	    tot = score1+score2+score3+score4+score5;

	    if(mxScore < score2)
	    	mxScore = score2;
	    else if(mnScore > score2)
	    	mnScore = score2;
	    if(mxScore < score3)
	    	mxScore = score3;
	    else if(mnScore > score3)
	    	mnScore = score3;
	    if(mxScore < score4)
	    	mxScore = score4;
	    else if(mnScore > score4)
	    	mnScore = score4;
	    if(mxScore < score5)
	    	mxScore = score5;
	    else if(mnScore > score5)
	    	mnScore = score5;

	    tot = tot - mxScore - mnScore;
	    ave = tot / 3;
	}
	void accountArr() {
		System.out.println("accountArr() Call");
	    mxScore = score[0];
	    mnScore = score[0];
	    tot = score[0];

	    for(int i=1; i<score.length; i++) { 
	    	if(mxScore < score[i])
	    		mxScore = score[i];
	    	else if(mnScore > score[i])
	    		mnScore = score[i];
	    	tot += score[i];
	    }
	    tot = tot - mxScore - mnScore;
	    ave = tot / 3;
	}
	// 자체 출력 메소드
	void stuPrint() {
		System.out.print(bun + "\t" + name + "\t");
	    System.out.print(score1 + "\t" + score2 + "\t");
	    System.out.print(score3 + "\t" + score4 + "\t");
	    System.out.print(score5 + "\t" + mxScore + "\t");
	    System.out.print(mnScore + "\t" + tot + "\t");
	    System.out.print(ave + "\t" + rank + "\n");
	}
	// 자체 출력 메소드
	void stuPrintArr() {
		System.out.print(bun + "\t" + name + "\t");
	    for(int i=0; i<score.length; i++) {
	    	System.out.print(score[i] + "\t");
	    }
	    System.out.print(mxScore + "\t" + mnScore + "\t");
	    System.out.print(tot + "\t" + ave + "\t" + rank                                                                 + "\n");
	}
}
