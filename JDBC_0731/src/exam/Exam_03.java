package exam;

import java.util.Scanner;
import model.StudentDAO;

public class Exam_03 {
    public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        System.out.print("학번을 입력하세요 (예: 10304): ");
        String studentId = scn.nextLine();

        if (studentId.length() != 5) {
            System.out.println("학번이 잘못되었습니다. 5자리 숫자를 입력하세요.");
            scn.close();
            return;
        }

        String syear = studentId.substring(0, 1); 
        String sclass = studentId.substring(1, 3); 
        String sno = studentId.substring(3); 

        int rowsAffected = dao.deleteStudentAndScores(syear, sclass, sno);
        if (rowsAffected > 0) {
            System.out.println(studentId + " 학생정보가 삭제되었습니다.");
        } else {
        	System.out.println(studentId + " 학생정보가 존재하지않습니다");
        }

    }
}