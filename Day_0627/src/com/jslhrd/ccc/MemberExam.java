package com.jslhrd.ccc;
import java.util.*;
public class MemberExam {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<Member>();
		
		list.add(new Member(7,"bbb"));
		list.add(new Member(1,"aaa"));
		list.add(new Member(4,"ddd"));
		list.add(new Member(3,"fff"));
		list.add(new Member(5,"kkk"));
		
		System.out.println("list : " + list);
		Collections.sort(list);
		System.out.println("list Sort: " + list);
		
	}

}
