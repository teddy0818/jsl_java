
public class Exam_03 {
	public static void main(String[] args) {
		//5*5행열 합계
		int arr[][] = new int[5][5];
	    int cnt=0;
	    //배열에 데이터 입력
	    for(int x=0; x<arr.length-1; x++) {
	    	for(int y=0; y<arr.length-1; y++) {
	    		cnt++;
	            arr[x][y]=cnt;
	            arr[x][4]+=arr[x][y];
	            arr[4][y]+=arr[x][y];
	            arr[4][4]+=arr[x][y];
	    	}
	    }

	    //배열 데이터 출력
	    for(int x=0; x<arr.length; x++) {
	    	for(int y=0; y<arr.length; y++) {
	    		System.out.print(arr[x][y]+"\t");
	    	}
	        System.out.print("\n");
	    }
	}

}
