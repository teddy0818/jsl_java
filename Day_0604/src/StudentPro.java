//학생들의 데이터 처리(정렬, 순위 .....)
public class StudentPro {
	//순위 구하기
	void studentRank(Student stu[], int cnt) {
		for(int i=0; i<cnt;i++) {
			stu[i].rank=1;
			for(int j=0; j<cnt;j++) {
				if(stu[i].tot < stu[j].tot) {
					stu[i].rank++;
				}
			}
		}
	}	
	//성적순 정렬
	void studentSort(Student stu[], int cnt) {
		for(int i=0; i<cnt-1;i++) {
			for(int j=i+1; j<cnt;j++) {
				if(stu[i].rank>stu[j].rank) {
					Student imsi = stu[i];
					stu[i] = stu[j];
					stu[j] = imsi;
				}
			}
		}
	}
}
