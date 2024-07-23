package exam;

import java.util.Scanner;

import model.CityDTO;
import model.ExamDAO;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ExamDAO dao = new ExamDAO();
		CityDTO dto = new CityDTO();
		
		System.out.print("입력:");
		dto.setCity(scn.next());
		dto.setCityname(scn.next());
		
		int row = dao.cityWrite(dto);
		if(row==1) {
			System.out.println("성공");
		}else {
			System.out.println("다시");
		}
		
		
	}

}

