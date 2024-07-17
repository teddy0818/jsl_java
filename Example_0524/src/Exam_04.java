//달팽이 배열
public class Exam_04 {
	public static void main(String[] args) {
		int a[][]=new int[5][5];
	    int k=0;// 1 2 3 4 . . 
	    int c=1;//부호(-, + )
	    int i=0;//row
	    int j=-1;//col
	    int m=a.length;

		while(m>=0){
			for(int n=0;n<m;n++){
				k++;
		        j=j+c;
		        a[i][j]=k;
			}
		    m=m-1;
		    for(int n=0;n<m;n++){
		    	k++;
		        i=i+c;
		        a[i][j]=k;
		    }
		    c = c*(-1);
		}
		//배열 데이터 출력
		for(int x=0; x<a.length;x++) {
			for(int y=0; y<a[x].length;y++) {
				System.out.printf("%3d", a[x][y]);
			}
			System.out.print("\n");
		}
	}
}
