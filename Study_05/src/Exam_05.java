
public class Exam_05 {
	public static void main(String[] args) {
		int score[]= {7,3,9,5,8,6,4,7,3,5,9,5};
		
		int tot=0;//총점
		System.out.print("전체 데이터 : ");
		for(int x : score) {
			System.out.printf("%3d", x);
			tot += x;
		}
		System.out.println();//줄바꿈
		//평균계산
		double ave = (double)tot / score.length;
		int count=0;//평균이상 데이터수 카운트
		System.out.printf("평균(%3.1f)이상 데이터:", ave);
		for(int x : score) {
			if(x>=ave) {
				System.out.printf("%3d", x);
				count++;
			}
		}
		System.out.println();//줄바꿈
		System.out.printf("평균(%3.1f)이상 데이터 수 : %d", ave,count);
		//출력예시
		//전체 데이터 : 7 3 9 5 8 6 4 7 3 5 9 5
		//평균(xx)이상 데이터 : x  x  x  x  x 
		//평균(xx)이상 데이터 수 : x
	}

}
