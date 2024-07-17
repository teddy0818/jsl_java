class BB{
	int bun;
	String name;
	BB(){}
	BB(int bun,String name){
		this.bun=bun;
		this.name=name;
	}
	void bbPrint() {
		System.out.print(bun+"\t"+name);
	}
}
class BBB{
	BB bb;
	int kor;
	int eng;
	int mat;
	BBB(){}
	BBB(BB bb, int kor, int eng, int mat){
		this.bb=bb;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	void bbPrint() {
		bb.bbPrint();
		System.out.print("\t"+kor + "\t" + eng + "\t" + mat + "\n");
	}
	void bbPrint2() {
		System.out.print(bb.bun+"\t"+bb.name + "\t");
		System.out.print(kor+"\t" + eng + "\t" + mat + "\n");
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		BB b = new BB(1,"aaa");
		BBB bbb = new BBB(b,90,70,80);
		
		BBB bbb2 = new BBB(new BB(2,"ccc"),70,70,70);
		bbb.bbPrint();
		bbb2.bbPrint2();
		
	}

}
