package com.jslhrd.bbb;
import java.util.*;
public class UserExam3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		List<User> list = new ArrayList<User>();
		list.add(new User("user01","AAA", 24));		
		list.add(new User("user02","BBB", 30));
		list.add(new User("user03","CCC", 28));
		list.add(new User("user04","DDD", 26));
		list.add(new User("user05","EEE", 31));
		list.add(new User("user06","FFF", 29));
		System.out.println(" ------    정렬 전 -------");
		System.out.println("아이디\t이름\t나이");
		for(User user : list) {
			System.out.print(user.getId() + "\t");
			System.out.print(user.getName() + "\t");
			System.out.print(user.getAge() + "\n");
		}
		//나이를 기준으로 오름차순 정렬
		for(int i=0; i<list.size()-1;i++) {
			for(int j=i+1; j<list.size();j++) {
				if(list.get(i).getAge() > list.get(j).getAge()) {
					User user1 = list.get(i);
					User user2 = list.get(j);
					list.set(i, user2);
					list.set(j, user1);
				}
			}
		}
		
		System.out.println(" ------    정렬 후 -------");
		System.out.println("아이디\t이름\t나이");
		for(User user : list) {
			System.out.print(user.getId() + "\t");
			System.out.print(user.getName() + "\t");
			System.out.print(user.getAge() + "\n");
		}
		
	}//main()끝
}
