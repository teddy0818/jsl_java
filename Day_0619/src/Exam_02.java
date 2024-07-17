
public class Exam_02 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		System.out.println("문자열 : " + sb.toString());
		//문자(문자열)추가
		sb.append(" Servlet");
		System.out.println("문자열 : " + sb.toString());
		char ch = sb.charAt(0);
		System.out.println("0번위치 문자 : " + ch);
		//삽입
		sb.insert(5, "JSL " );
		System.out.println("문자열 : " + sb.toString());
		//삭제
		sb.delete(0, 4);//0부터 4전까지
		sb.deleteCharAt(7);//7번째 삭제
		
		sb.setCharAt(8, 'A');//8번 'A'변경
		
		sb.replace(0, 3, "KOR");//0부터 3전까지 치환
		
		sb.reverse();//문자열 뒤집기
		
		
		
		
	}

}
