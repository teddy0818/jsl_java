public class Exam_01 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(30);
		StringBuffer sb3 = new StringBuffer("Korea");
		// 실제크기(물리적)
		int size = sb1.capacity();//16
		System.out.println("sb1 size =" + size);
		System.out.println("sb2 size =" + sb2.capacity());
		System.out.println("sb3 size =" + sb3.capacity());
		//문자열 갯수
		System.out.println("sb1 char size =" + sb1.length());
		System.out.println("sb2 char size =" + sb2.length());
		System.out.println("sb3 char size =" + sb3.length());
		
	}

}
