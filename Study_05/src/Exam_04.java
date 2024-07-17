//배열에 저장된 데이터 활용
public class Exam_04 {
	public static void main(String[] args) {
		int score[]= {7,3,9,5,8,6,4,7,3,5,9,5};
		//score배열에 저장된 데이터 중 
		// 5이상데이터출력 및 데이터수
		System.out.print("전체데이터 : ");
		for(int x : score) {
			System.out.printf("%3d", x);
		}
		System.out.print("\n");
		int count=0;// 데이터수 카운트용
		System.out.print("5 이상데이터 : ");
		for(int i=0; i<score.length;i++) {
			if(score[i]>=5) {
				System.out.printf("%3d", score[i]);
				count++;
			}
		}
		System.out.print("\n");
		System.out.print("5이상데이터수 : " + count);
	}

}
