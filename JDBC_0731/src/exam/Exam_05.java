package exam;

import java.util.List;

import model.DeptDAO;
import model.DeptDTO;

public class Exam_05 {
    public static void main(String[] args) {
    	 DeptDAO dao = new DeptDAO();
         
         List<DeptDTO> statsList = dao.getClassStats();
         
         System.out.println("학년\t반\t교사명\t\t국어총점\t영어총점\t수학총점\t국어평균\t영어평균\t수학평균");
         if (statsList.isEmpty()) {
             System.out.println("등록된 자료가 없습니다.");
         } else {
             for (DeptDTO dto : statsList) {
                 System.out.print(dto.getSyear() + "\t");
                 System.out.print(dto.getSclass() + "\t");
                 System.out.print(dto.getTname() + "\t\t");
                 System.out.print(dto.getKorTotal() + "\t\t");
                 System.out.print(dto.getEngTotal() + "\t\t");
                 System.out.print(dto.getMatTotal() + "\t\t");
                 System.out.print(String.format("%.1f", dto.getKorAvg()) + "\t\t");
                 System.out.print(String.format("%.1f", dto.getEngAvg()) + "\t\t");
                 System.out.print(String.format("%.1f", dto.getMatAvg()) + "\n");
             }
         }
     }
   }
