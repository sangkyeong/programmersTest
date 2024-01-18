package programmersTest;

public class _test231130_1316_LV3_intTriangle {
    public static int solution(int[][] triangle) {
        for(int i=triangle.length-1;i>0;i--) {
        	for(int j=0;j<triangle[i].length-1;j++) {
        		triangle[i-1][j] += Math.max(triangle[i][j], triangle[i][j+1]);
        	}
        }
        return triangle[0][0];
    }

	public static void main(String[] args){
		int[][] new_id = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
