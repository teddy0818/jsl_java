package com.jslhrd.bbb;
//환경변수 값을 읽을 경우getenv()
public class Exam_06 {
	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println(javaHome);
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		String path = System.getProperty("user.dir");
		
		System.out.println("운영체제 이름 : " + osName);
		System.out.println("사용자 이름 : " + userName);
		System.out.println("사용자 디렉토리(폴더) : " + userHome);
		System.out.println("현재 프로젝트경로 : " + path);
		
	}

}
