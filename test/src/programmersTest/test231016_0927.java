package programmersTest;

import java.util.Arrays;

public class test231016_0927 {
	
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int su = 1;
	        for(int y= 0;y<n;y++) {
	        	for(int x=0;x<n;x++) {
	        		answer[y][x] = su++;
	        		
	        	}
	        	
	        }
        System.out.println(Arrays.deepToString(answer));
        return answer;
    }

	public static void main(String[] args) {
		int n = 5;
		solution(n);
	}

}
