package com.jslhrd.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.jslhrd.bbb.Person;

public class Main_set {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner scn = new Scanner(System.in);
		
		Set<Student> sList = new HashSet<>();
		File file = new File("src/student.dat");
		if(file.exists() && file.length() > 0) {
			ObjectInputStream ois = 
					new ObjectInputStream(
							new BufferedInputStream(
									new FileInputStream(file)));
			sList = (Set<Student>)ois.readObject();
			ois.close();
		}
		
		while(true) {
			System.out.println("[1]학생등록 [2]전체출력 [3]종료");
			int selectedNum = scn.nextInt();
			
			// 1. 학생등록
			if(selectedNum == 1) {
				System.out.println("----학생등록----");
				
				System.out.print("입력 : ");
				String str[] = scn.next().split(",");
				
				int bun = Integer.parseInt(str[0]);
				String name = str[1];
				int kor = Integer.parseInt(str[2]);
				int eng = Integer.parseInt(str[3]);
				int mat = Integer.parseInt(str[4]);
				
				// 중복 방지 (for문)
//				boolean isSame = false;
//				for(int i=0; i<sList.size(); i++) {
//					int listBun = sList.get(i).getBun();
//					if(bun == listBun) {
//						isSame = true;
//					}
//				}
//				if(isSame) {
//					System.out.println("중복된 번호 입니다. 다시 입력해주세요.");
//					break;
//				}
				
				Student s = new Student(bun,name,kor,eng,mat);
				
				// 중복 방지
				boolean isSame = sList.add(s);
				if(!isSame) {
					break;
				}
				
				System.out.println("성적을 등록했습니다");
				
			// 2. 전체 출력
			} else if (selectedNum == 2) {
				System.out.println("----전체출력----");
				
				if(sList.size() == 0) {
					System.out.println("등록 된 성적이 없습니다");
					continue;
				}
			
					int korSum = 0;
					int engSum = 0;
					int mathSum = 0;
					int totSum = 0;
				   Iterator<Student> iterator = sList.iterator();
			        while (iterator.hasNext()) {
			            Student s = iterator.next();
						System.out.println(s.getBun()+"\t"+s.getName()+"\t"+s.getKor()+"\t"+s.getEng()+"\t"+s.getMat()+"\t"+s.getTot()+"\t"+s.getAve()+"\t"+s.getGrade());
						
						korSum += s.getKor();
						engSum += s.getEng();
						mathSum += s.getMat();
						totSum += s.getTot();
					}
					int listNum = sList.size();
					System.out.println("총점\t\t" + korSum + "\t" + engSum + "\t" + mathSum + "\t" + totSum);
					System.out.printf("평균\t\t%.2f\t%.2f\t%.2f\t%.2f\n",
                            (double) korSum / listNum, (double) engSum / listNum,
                            (double) mathSum / listNum, (double) totSum / listNum);
					System.out.println();
					
			// 3. 종료
			} else if (selectedNum == 3) {
				// 파일 저장
				ObjectOutputStream oos = 
						new ObjectOutputStream(
								new BufferedOutputStream(
										new FileOutputStream(file)));
				oos.writeObject(sList);
				oos.close();
				
				System.out.println("----종료----");
				break;
			}
			
			
		}

	}

}
