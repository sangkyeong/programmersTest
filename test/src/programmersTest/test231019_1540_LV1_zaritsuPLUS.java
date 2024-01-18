package programmersTest;

public class test231019_1540_LV1_zaritsuPLUS {
	
    public static int solution(int n) {
        int answer = 0;
        while(n>0){
            answer += (n%10);
            n /= 10;
        }
        return answer;
    }

	public static void main(String[] args) {
		int n = 123;
		
		System.out.println(solution(n));
		//System.out.println(Arrays.toString(solution(N)));
	}
}
