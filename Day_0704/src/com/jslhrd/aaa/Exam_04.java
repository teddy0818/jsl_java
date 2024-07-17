package com.jslhrd.aaa;
//파일로부터 읽어서 출력(컬렉션)
import java.io.*;
import java.util.*;
public class Exam_04 {
	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = 
				new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream(
										new File("src/listObject.txt"))));
		
		Object obj = ois.readObject();
		List list = (List)obj;
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
