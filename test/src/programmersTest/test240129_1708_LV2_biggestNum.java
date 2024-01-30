package programmersTest;

import java.util.Arrays;

public class test240129_1708_LV2_biggestNum {
	/**
	 * 프로그래머스_Lv1_가장큰수
	 *	- 한 글자 씩 떼서 큰 숫자부터 붙임 X
	 *	- 배열 요소끼리 크기 비교 후 붙임 X
	 *	-
	 */
	public static String solution(int[] numbers) {
		String answer = "";
		String[] test = Arrays.stream(numbers)
						.mapToObj(String::valueOf)
						.toArray(String[]::new);
		Arrays.sort(test, (x, y) -> (y+x).compareTo(x+y));
		System.out.println(Arrays.toString(test));

		for(int i=0;i<test.length;i++) {
			answer += test[i];
		}
		if(answer.startsWith("0")) {
			answer = "0";
		}
		return answer;
	}

	public static void main(String[] args){
		int[] new_id = {6, 10, 2};

		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
