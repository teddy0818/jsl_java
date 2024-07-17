class CC{
	private int bun;
	private String name;
	private String gender;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	void print() {
		System.out.println("번호 : " + bun);
		System.out.println("이름 : " + name);
		//System.out.println("성별 : " + gender);
		String str="여자";
		if(gender.equalsIgnoreCase("m")) {
			str="남자";
		}
		System.out.println("성별 : " + str);
	}
	
}
public class Exam_05 {
	public static void main(String[] args) {
		//키보드입력
		int b = 1101;
		String name="aaaa";
		String g="M";
		
		CC c1 = new CC();
		c1.bun=1;
		
		c1.setBun(b);
		c1.setName(name);
		c1.setGender(g);
		
		System.out.println("번호 : " + c1.getBun());
		System.out.println("이름 : " + c1.getName());
		//System.out.println("성별 : " + c1.getGender());
		String str="여자";
		if(c1.getGender().equalsIgnoreCase("m")) {
			str="남자";
		}
		System.out.println("성별 : " + str);
		
		System.out.println("-------------------------");
		c1.print();
	}

}
