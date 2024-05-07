package programmersTest;

public class test240507_2148_LV1_divCntSum {
    public static int solution(int left, int right) {
		int answer = 0;
		for(int i=left;i<=right;i++){
			int num = (int)Math.sqrt(i);
			int cnt = 0;
			for(int j=1;j<=num;j++){
				if(num%j == 0){
					cnt++;
					System.out.println(j);
				}
			}
			if((cnt*2)%2 == 0)answer += i;
			else answer -= i;
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
