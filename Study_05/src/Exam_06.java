
public class Exam_06 {

	public static void main(String[] args) {
		int score[]= {7,3,9,5,8,6,4,7,3,5,9,5};
/*		int max = score[0];
		int min = score[0];
		int sum = 0;
		for(int x : score) {
			if(max < x) {
				max = x;
			}else if(min > x) {
				min=x;
			}
			sum += x;
		}
*/
		int max = score[0];
		int min = score[0];
		int sum = score[0];
		for(int i=1; i<score.length;i++) {
			if(max < score[i]) {
				max=score[i];
			}else if(min>score[i]) {
				min=score[i];
			}
			sum+=score[i];
		}
		System.out.println("최대 : " + max);//9
		System.out.println("최소 : " + min);//3
		System.out.println("합계 : " + sum);//71
		

	}

}
