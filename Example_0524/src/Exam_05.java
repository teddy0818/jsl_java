
public class Exam_05 {
	//총점 순위계산
	static void account(int val[][]) {
		//총점계산
		for(int i=0; i<val.length;i++) {
			val[i][4] = val[i][1]+val[i][2]+val[i][3];//총점
		}
		//순위
		for(int i=0; i<val.length;i++) {
			val[i][5] = 1;//순위
			for(int j=0; j<val.length;j++) {
				if(val[i][4] < val[j][4]) {
					val[i][5]++;		
				}
			}
		}
	}
	//배열 출력 메소드
	static void dataPrint(int val[][]) {
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<val.length;i++) {
			for(int j=0; j<val[i].length;j++) {
				System.out.print(val[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	//번호기준 오름차순 정렬 메소드
	static void dataSort(int val[][]) {
		for(int i=0; i<val.length-1; i++) {
			for(int j=i+1; j<val.length;j++) {
				if(val[i][0] > val[j][0]) {
					int imsi[] = val[i];
					val[i] = val[j];
					val[j] = imsi;
				}
			}
		}
	}
	//총점이 가장 높은 학생, 낮은 학생 출력
	static void totMaxMin(int val[][]) {
		int max[] = val[0];
		int min[] = val[0];
		for(int i=1; i<val.length;i++) {
			if(max[4] < val[i][4]) {
				max = val[i];
			}else if(min[4] > val[i][4]) {
				min = val[i];
			}
		}
		System.out.print("총점최대");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<max.length;i++) {
			System.out.print(max[i]+"\t");
		}
		System.out.print("\n");
		System.out.print("총점최소");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<min.length;i++) {
			System.out.print(min[i]+"\t");
		}
		System.out.print("\n");
		
	}
	//2차원 배열 복제
	static int[][] arrayCopy(int val[][]){
		int temp[][] = new int[val.length][val[0].length];
		for(int i=0; i<val.length;i++) {
			for(int j=0; j<val[i].length;j++) {
				temp[i][j] = val[i][j];
			}
		}
		
		return temp;
	}
	public static void main(String[] args) {
		int values[][]= {{5,90,88,78,0,0},
	    	         {2,90,85,80,0,0}, {1,80,70,90,0,0},
	    	         {3,95,90,85,0,0}, {4,88,78,90,0,0}};
		//총점순위 메소드 호출
		account(values);

		//배열복제 메소드 호출
		int data[][] = arrayCopy(values);
		
		//번호기준 오름차순 정렬 메소드
		dataSort(data);
		
		//출력 메소드 호출(정렬 전)
		dataPrint(values);
		
		//출력 메소드 호출(정렬후)
		dataPrint(data);
		
		//총점 최대, 최소 출력메소드 호출
		totMaxMin(values);
	}

}
