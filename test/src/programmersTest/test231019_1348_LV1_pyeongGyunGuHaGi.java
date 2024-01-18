package programmersTest;

public class test231019_1348_LV1_pyeongGyunGuHaGi {
	
    public static double solution(int[] arr) {
        double answer = 0;
        for(double num : arr) {
        	answer += num;
        }
        return answer / arr.length;
    }

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		
		System.out.println(solution(arr));
		//System.out.println(Arrays.toString(solution(N)));
	}
}
