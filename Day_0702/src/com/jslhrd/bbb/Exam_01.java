package com.jslhrd.bbb;

import java.io.File;

public class Exam_01 {
	public static void main(String[] args) {
		File file = new File("c:/Users/websnet/data");
		if(file.exists()) {
			//존재하면 삭제
			file.delete();
			System.out.println("data 삭제됨");
		}else {
			//System.out.println("data 폴더가 없음");
			file.mkdir();
		}
		
	}

}
