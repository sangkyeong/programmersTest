package programmersTest;

public class test240422_2250_BEAKJOON_movieShom {
    public static int solution(int new_id) {
    	int answer = 0;
		int num = 0;

		while(true){
			num++;
			if(String.valueOf(num).contains("666"))
				answer ++;
			if(new_id == answer)
			break;
		}

        return num;
    }

	public static void main(String[] args){
		int new_id = 500;
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
