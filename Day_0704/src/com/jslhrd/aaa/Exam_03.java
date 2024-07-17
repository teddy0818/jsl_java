package com.jslhrd.aaa;
//컬렉션 -> 파일로 저장
import java.util.*;
import java.io.*;

public class Exam_03 {
	public static void main(String[] args) throws Exception{
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Oracle");
		list.add("JSLHRD");
		list.add("DataBase");
		list.add("Spring");
		
		ObjectOutputStream oos = 
				new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(
										new File("src/listObject.txt"))));
		oos.writeObject(list);
		oos.close();
		System.out.println("프로그램을 종료합니다.");
		
	}

}
