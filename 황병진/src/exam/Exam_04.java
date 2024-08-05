package exam;

import java.util.List;

import model.StudentDAO;
import model.StudentDTO;

public class Exam_04 {
    public static void main(String[] args) {
    	StudentDAO dao = new StudentDAO();
        
        List<StudentDTO> list = dao.getAllStudentInfo();
        int korTot = 0;
        int engTot = 0;
        int mathTot = 0;
        
        System.out.println("학년-반-번호\t이름\t성별\t국어\t영어\t수학\t총점\t평균");
        if(list.isEmpty()) {
            System.out.println("등록된 자료가 없습니다.");
        } else {
            for (StudentDTO dto : list) {
                String studentInfo = dto.getSyear() + "-" + dto.getSclass() + "-" + dto.getSno();
                System.out.print(studentInfo + "\t");
                
                System.out.print(dto.getSname() + "\t");
                System.out.print(dto.getGender() + "\t");
                System.out.print(dto.getKor() + "\t");
                System.out.print(dto.getEng() + "\t");
                System.out.print(dto.getMath() + "\t");
                System.out.print(dto.getTot() + "\t");
                System.out.print(dto.getAvg() + "\n");
                
                korTot += dto.getKor();
                engTot += dto.getEng();
                mathTot += dto.getMath();
                
            }
        }
        
        double korAvg = Math.round((korTot / (double)list.size()) * 10) / 10.0;
        double engAvg = Math.round((engTot / (double)list.size()) * 10) / 10.0;
        double mathAvg = Math.round((mathTot / (double)list.size()) * 10) / 10.0;
        
        System.out.println("\t\t\t학년총점\t" + korTot + "\t" + engTot + "\t" + mathTot);
        System.out.println("\t\t\t학년평균\t" + korAvg + "\t" + engAvg + "\t " + mathAvg);

    }
}
