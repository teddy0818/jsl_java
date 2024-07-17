
public class Exam_05 {

	public static void main(String[] args) {
		int a[]= {5,9,3,6,4,2,8,5,7};
		//배열의 데이터에서 4이상 데이터만 출력, 갯수
		int cnt=0;
		for(int i=0; i<a.length;i++) {
			if(a[i]>=4) {
				System.out.print(a[i] + " ");
				cnt++;
			}
		}
		System.out.print("\n");
		System.out.print("4이상 데이터수 : " + cnt);
	}

}
