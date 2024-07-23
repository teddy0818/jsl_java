package exam;

import model.ExamDAO;

public class Exam_01 {

	public static void main(String[] args) {
		ExamDAO dao = new ExamDAO();
		
		int row = dao.createTable();
		if(row == 1) {
				System.out.println("테이블 생성 성공");
		} else {
				System.out.println("테이블 생성 실패");
		}

	}

}
