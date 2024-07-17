class Student{
	int bun;//번호
	String name;//이름
	//int kor,eng,mat,tot;
	int kor;//국어
	int eng;//영어
	int mat;//수학
	int tot;//총점
	double ave;//평균
	String grade;//학점
	
	Student(){}
	Student(int bun,String name, int kor,int eng,int mat){
		this.bun=bun;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	//기능구현(총점계산)
	void setTot() {
		tot = kor + eng + mat;
	}
	void setAve() {
		ave = tot / 3.;
	}
	void setGrade() {
		if(ave>=90) {
			grade="수";
		}else if(ave>=80) {
			grade="우";
		}else if(ave>=70) {
			grade="미";
		}else if(ave>=60) {
			grade="양";
		}else {
			grade="가";
		}
	}
	void stuPrint() {
		//System.out.print(bun + "\t" + name + "\t" + kor . . .);
		System.out.print(bun + "\t");
		System.out.print(name + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(mat + "\t");
		System.out.print(tot + "\t");
		System.out.print(ave + "\t");
		System.out.print(grade + "\n");

	}
}
public class Exam_01 {
	public static void main(String[] args) {
		int bun=1101;
		String name="김학생";
		int kor=88;
		int eng=95;
		int mat=85;
		
		Student st1 = new Student();
		st1.bun=bun;
		st1.name=name;
		st1.kor=kor;
		st1.eng=eng;
		st1.mat=mat;
		st1.setTot();
		st1.setAve();
		st1.setGrade();
		st1.stuPrint();
		
		//Student st2 = new Student(1102,"aaa",90,88,70);
		Student st2 = new Student(bun,name,kor,eng,mat);
		st2.setTot();
		st2.setAve();
		st2.setGrade();
		st2.stuPrint();
		
		
	}

}
