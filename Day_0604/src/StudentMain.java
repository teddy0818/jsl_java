import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    Student[] stu = new Student[10];
	    int cnt = 0;
	    while(cnt<10) {
	    	System.out.print("학생등록:");
	        int bun = scn.nextInt();
	        if(bun==0) {
	        	break;
	        }
	        String name = scn.next(); int score1 = scn.nextInt(); 
	        int score2 = scn.nextInt(); int score3 = scn.nextInt();
	        int score4 = scn.nextInt(); int score5 = scn.nextInt();
	        stu[cnt] = new  Student(bun,name,score1,score2,score3,                                                     score4,score5);
	        cnt++;
	    }
	    // 석차 구하기
	    StudentPro pro = new StudentPro();
	    pro.studentRank(stu, cnt);
	    // 전체 출력-입력자료순
	    System.out.println("번호\t이름\t점수1\t점수2\t점수3\t점수4\t점수5\t최대\t최소\t합계\t평균\t순위");
	    for(int i=0; i<cnt; i++) {
	    	stu[i].stuPrint();
	    }
	    // 전체 출력-성적순
	    pro.studentSort(stu, cnt);//순위를 기준으로 오름차순 정렬
	    
	    System.out.println("성적순 출력");
	    System.out.println("번호\t이름\t점수1\t점수2\t점수3\t점수4\t점수5\t최대\t최소\t합계\t평균\t순위");
	    for(int i=0; i<cnt; i++) {
	    	stu[i].stuPrint();
	    }

	}
}
