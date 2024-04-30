package programmersTest;

import java.util.Arrays;

public class test240429_2100_LV1_maxminDiv {
    public static int[] solution(int n, int m) {
		int[] answer = {1, 1};
		//두 수 중 대소비교 후 변수에 대입
		int min = n > m ? m : n;
		int max = n > m ? n : m;
		//공배수를 구하기위한 변수
		int j = 1;

		//제일 작은 수를 기준으로 큰 수부터 약수를 구한 후 큰 수 도 나누어 떨어지면 공약수
		for (int i = min; i > 0; i--) {
			if ((min % i == 0) && (max % i == 0)) {
				answer[0] = i;
				break;
			}
		}

		//제일 작은 수 를 1부터 곱해서 큰수도 나누어 떨어지면 공배수
		while((min * j) % max != 0){
			j++;
		}
		answer[1] = min * j;
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	public static void main(String[] args){
		int new_id = 63;
		int b = 90;

		System.out.println(solution(new_id, b));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
