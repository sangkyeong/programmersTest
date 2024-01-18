package programmersTest;

public class test231127_1325_LV2_jumpAndMove {
    public static int solution(int n) {
        int ans = 0;
        int num = n;
        
        while(num != 0) {
	        if((num % 2) != 0) {
	        	num -= 1;
	        	ans++;
	        }else num /= 2;
        }

        return ans;
    }

	public static void main(String[] args){
		int new_id = 5000;
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
