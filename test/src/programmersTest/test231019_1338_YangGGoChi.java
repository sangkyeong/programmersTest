package programmersTest;

public class test231019_1338_YangGGoChi {
	
    public static int solution(int n, int k) {
       	k -= n/10;
        return 12000 * n + 2000 * k;
    }

	public static void main(String[] args) {
		int n = 64;
		int k = 7;
		
		System.out.println(solution(n, k));
		//System.out.println(Arrays.toString(solution(N)));
	}

}
