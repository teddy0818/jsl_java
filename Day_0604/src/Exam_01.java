class AA{
	int bun;//번호
	String name;//이름
	int age;//나이
	AA(){}
	AA(int bun,String name, int age){
		this.bun=bun;
		this.name=name;
		this.age=age;
	}
	void aaPrint() {
		System.out.print(bun+"\t"+name+"\t"+age);
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		AA aa[] = new AA[10];//객체 배열
		AA a = new AA();
		a.bun=3;
		a.name="김학생";
		a.age=30;
		aa[0] = a;
		//a.aaPrint();
		//System.out.println();
		AA a1 = new AA(1,"이학생", 23);
		//a1.aaPrint();
		aa[1]=a1;
		aa[2] = new AA(2,"강학생", 28);
		
		a1 = new AA(6,"최학생", 29);
		aa[3]=a1;
		//aa[0].age=33;
		//aa[0].aaPrint();
		System.out.println("번호\t이름\t나이");
/*		
		for(int i=0; i<4; i++) {
			aa[i].aaPrint();
			System.out.print("\n");
		}
*/
		for(int i=0;i<4; i++) {
			System.out.print(aa[i].bun + "\t");
			System.out.print(aa[i].name + "\t");
			System.out.print(aa[i].age + "\n");
		}
	}

}
