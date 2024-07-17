
public class Exam_06 {
	public static void main(String[] args) {
		int score[]= {55,98,78,67,98,67,77,90,85,75};
		//평균 출력, 평균이상 데이터, 데이터수 출력
		//배열 요소 출력
		System.out.print("점수 : ");
		for(int i=0; i<score.length;i++) {
			//System.out.print(score[i]+" ");
			System.out.printf("%3d", score[i]);
		}
		System.out.print("\n");
		//총점계산
		int tot=0;
		for(int i=0; i<score.length;i++) {
			tot = tot + score[i];
		}
		double ave = (double)tot / score.length;
		System.out.println("평균 : " + ave);
		
		//평균이상 출력 및 데이터 수 카운트
		int cnt=0;
		System.out.print(ave + "이상 : ");
		for(int i=0; i<score.length;i++) {
			if(score[i] >= ave) {
				System.out.print(score[i] + " ");
				cnt++;
			}
		}
		System.out.print("\n");
		System.out.println(ave+"이상 데이터 수 : " + cnt);
	}

}
