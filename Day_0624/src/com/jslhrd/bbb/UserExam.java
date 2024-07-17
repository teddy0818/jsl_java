package com.jslhrd.bbb;
import java.util.*;
public class UserExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		List<User> list = new ArrayList<User>();
		//입력
		while(true) {
			System.out.print("회원등록:");
			String[] str = scn.nextLine().split(",");
			if(str[0].equalsIgnoreCase("end"))
				break;
			//User객체 생성
			User user = new User(str[0],str[1],
					             Integer.parseInt(str[2]));
			
			//id중복검사
			//boolean bool = list.contains(user);
			
			boolean bool = true;
			for(int i=0; i<list.size();i++) {
				if(user.equals(list.get(i).getId())) {
					bool = false;
					break;
				}
			}
			if(bool)
				list.add(user);
			else
				System.out.println("중복된 ID입니다.");
		
		}//while(true)끝
		
		//출력 테스트
		System.out.println("아이디\t이름\t나이");
		
		
	}//main()끝
}
