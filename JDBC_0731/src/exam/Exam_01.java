package exam;

import java.util.List;
import java.util.Scanner;

import model.StudentDAO;
import model.StudentDTO;

public class Exam_01 {
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
	        StudentDAO dao = new StudentDAO();
	        StudentDTO dto = new StudentDTO();
	        
	        System.out.print("학년 : ");
	        dto.setSyear(scn.nextLine());
	        
	        System.out.print("반 : ");
	        dto.setSclass(scn.nextLine());
	        
	        System.out.print("번호 : ");
	        dto.setSno(scn.nextLine());
	        
	        System.out.print("이름 : ");
	        dto.setSname(scn.nextLine());
	        
	        System.out.print("생년월일 (YYYYMMDD): ");
	        dto.setBirth(scn.nextLine());
	        
	        System.out.print("성별 (M/F): ");
	        dto.setGender(scn.nextLine());
	        
	        System.out.print("전화번호 (010 1234 5678): ");
	        String phoneNumber = scn.nextLine();
	        
	        String[] phoneParts = phoneNumber.split(" ");
	        if (phoneParts.length == 3) {
	            dto.setTel1(phoneParts[0]);
	            dto.setTel2(phoneParts[1]);
	            dto.setTel3(phoneParts[2]);
	        } else {
	            System.out.println("전화번호 형식이 올바르지 않습니다.");
	            return; 
	        }
	        
	        int row = dao.studentWrite(dto);
	        if (row == 1) {
	            System.out.println("등록 성공");
	            
	            List<StudentDTO> list = dao.getAllStudents();
	            for (StudentDTO dto2 : list) {
	                System.out.print(dto2.getSyear() + "\t");
	                System.out.print(dto2.getSclass() + "\t");
	                System.out.print(dto2.getSno() + "\t");
	                System.out.print(dto2.getSname() + "\t");
	                System.out.print(dto2.getBirth() + "\t");
	                
	                String gender = "여자";
	                if (dto2.getGender().equals("M")) gender = "남자";
	                System.out.print(gender + "\t");
	                
	                System.out.print(dto2.getTel1() + "-");
	                System.out.print(dto2.getTel2() + "-");
	                System.out.print(dto2.getTel3() + "\n");
	            }
	            
	        } else {
	            System.out.println("등록 실패");
	        }

	}
}
