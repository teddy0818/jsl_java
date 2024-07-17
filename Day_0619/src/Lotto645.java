import java.util.*;

public class Lotto645 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random r = new Random();
		int lotto[] = new int[6];
		int cnt=0;
		while(cnt<6) {//while(cnt<lotto.length)
			int k = r.nextInt(45)+1;
			int sw=0;
			//중복검사
			for(int i=0; i<cnt; i++) {
				if(k == lotto[i]) {
					sw=1;
					break;
				}
			}
			if(sw==0) {
				lotto[cnt]=k;
				cnt++;
			}
		}
		System.out.println("Lotto : " + Arrays.toString(lotto));
		Arrays.sort(lotto);
		System.out.println("Lotto : " + Arrays.toString(lotto));
	}

}
