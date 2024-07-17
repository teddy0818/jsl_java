
public class Exam_03 {

	public static void main(String[] args) {
		int a[] = {5,3,9,6,4,7};
		int tot=0;
		System.out.print("5이상:");
		for(int i=0; i<a.length;i++) {
			tot += a[i];//전체합계
			if(a[i]>=5) {
				System.out.println(a[i]);
			}
		}
		System.out.println("전체합 : " + tot);
		int sum=0;
		for(int x : a) {
			sum += x;
			if(x>=5) {
				System.out.println(x);
			}
		}
		System.out.println("전체합 : " + sum);
		
		
	}

}
