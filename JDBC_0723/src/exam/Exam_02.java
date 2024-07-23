package exam;

import model.CityDTO;
import model.ExamDAO;

public class Exam_02 {

		public static void main(String[] args) {
			ExamDAO dao = new ExamDAO();
			//키보드입력
			String city="15";
			String cityname="중구";
			
			CityDTO dto = new CityDTO();
			dto.setCity(city);
			dto.setCityname(cityname);
			
			//dto.setCity("15");
			//dto.setCityname("중구");
			
			int row = dao.cityWrite(dto);
			if(row==1) {
				System.out.println("등록되었습니다");
			}else {
				System.out.println("다음에 다시 등록하세요");			
			}
			

	}

}
