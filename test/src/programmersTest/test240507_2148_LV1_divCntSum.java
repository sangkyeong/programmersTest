package programmersTest;

public class test240507_2148_LV1_divCntSum {
    public static int solution(int left, int right) {
		int answer = 0;
		for(int i=left;i<=right;i++){
			if(i%Math.sqrt(i) == 0) answer -= i;
			else answer += i;
		}
		return answer;
    }

	public static void main(String[] args){
		int new_id = 13;
		int new_id2 = 17;

		System.out.println(solution(new_id, new_id2));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
