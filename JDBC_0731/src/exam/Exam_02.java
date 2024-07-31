package exam;

import java.util.List;
import java.util.Scanner;

import model.ScoreDAO;
import model.ScoreDTO;

public class Exam_02 {
	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
	        ScoreDAO dao = new ScoreDAO();
	        ScoreDTO dto = new ScoreDTO();
	        
	        System.out.print("학년 : ");
	        dto.setSyear(scn.nextLine());
	        
	        System.out.print("반 : ");
	        dto.setSclass(scn.nextLine());
	        
	        System.out.print("번호 : ");
	        dto.setSno(scn.nextLine());
	        
	        System.out.print("국어 점수 : ");
	        dto.setKor(Integer.parseInt(scn.nextLine()));
	        
	        System.out.print("영어 점수 : ");
	        dto.setEng(Integer.parseInt(scn.nextLine()));
	        
	        System.out.print("수학 점수 : ");
	        dto.setMat(Integer.parseInt(scn.nextLine()));
	        
	        int row = dao.scoreWrite(dto);
	        if (row == 1) {
	        	System.out.println("등록 성공");
	            
	            List<ScoreDTO> list = dao.scoreList();
	            System.out.println("학년\t반\t번호\t국어\t영어\t수학\t총점\t평균");
	           
            	for (ScoreDTO dto2 : list) {
            	    // 성적 정보
            	    int kor = dto2.getKor();
            	    int eng = dto2.getEng();
            	    int mat = dto2.getMat();
            	    
            	    // 총점과 평균 점수 계산
            	    int total = kor + eng + mat;
            	    double average = total / 3.0;
            	    // 소수점 둘째 자리에서 반올림하여 첫째 자리까지 표시
            	    double roundedAverage = Math.round(average * 10) / 10.0;
            	    
            	    // 출력
            	    System.out.print(dto2.getSyear() + "\t");
            	    System.out.print(dto2.getSclass() + "\t");
            	    System.out.print(dto2.getSno() + "\t");
            	    System.out.print(kor + "\t");
            	    System.out.print(eng + "\t");
            	    System.out.print(mat + "\t");
            	    System.out.print(total + "\t");
            	    System.out.print(roundedAverage + "\n");
            	}	
	       } else {
	        	System.out.println("등록 실패");
	        }

	}
}
