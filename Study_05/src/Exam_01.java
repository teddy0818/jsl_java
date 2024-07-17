//배열에 데이터 입력
public class Exam_01 {
	public static void main(String[] args) {
		int a[]= {5,2,8,6,9};
		int len = a.length;
		System.out.print("a : ");
		for(int i=0; i<len;i++) {
			System.out.print(a[i]+"\t");
		}
/*		
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
*/
		System.out.print("\n");
		System.out.print("a : ");
		for(int x : a) {
			System.out.print(x+"\t");
		}
		
	}

}
