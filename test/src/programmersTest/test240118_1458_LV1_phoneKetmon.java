package programmersTest;

import java.util.stream.IntStream;

public class test240118_1458_LV1_phoneKetmon {
    public static int solution(int[] new_id) {
    	int[] test = IntStream.of(new_id)
    	.distinct()
    	.toArray();
    	 
        return new_id.length/2 < test.length ? new_id.length/2 : test.length ;
    }

	public static void main(String[] args){
		int[] new_id = {3,3,3,2,2,2}; 
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}