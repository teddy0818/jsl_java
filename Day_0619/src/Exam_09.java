//문자열 분리

import java.util.StringTokenizer;

public class Exam_09 {
	public static void main(String[] args) {
		String name="김학생,이학생,강학생,유학생,박학생";
		StringTokenizer st = new StringTokenizer(name,",");
		while(st.hasMoreTokens()) {
			String n = st.nextToken();
			System.out.println(n);
		}
		String name2="김학생 이학생,강학생 유학생,박학생";
		StringTokenizer st2 = new StringTokenizer(name2,", ");
		while(st2.hasMoreTokens()) {
			String n2 = st2.nextToken();
			System.out.println(n2);
		}
		
	}

}
