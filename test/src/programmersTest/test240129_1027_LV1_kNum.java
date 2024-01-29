package programmersTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test240129_1027_LV1_kNum {
	/**
	 * 프로그래머스_Lv1_k번째 수
	 *	- array list로 변환
	 *	- commands값 뽑아서 array원하는 숫자 가져오기
	 *	- 오름차순 정렬 후 개수만큼 가져오기
	 *	- 가져온 숫자 반환
	 */

	public static int[] solution(int[] array, int[][] commands) {

		List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());
		List<Integer> sort = new ArrayList<Integer>();
		int[] answer = new int[commands.length];

		//commands돌면서 값 뽑기
		for(int i=0;i<commands.length;i++) {
			for(int j=commands[i][0]-1;j<commands[i][1];j++) {
				sort.add(arrayList.get(j));
			}

			sort = sort.stream().sorted().collect(Collectors.toList());

			//세번째 인자로 정렬된 배열에서 값 뽑아내기
			answer[i] = sort.get(commands[i][2]-1);

			sort.clear();
		}

		return answer;
	}

	public static void main(String[] args){
		int[] new_id = {1, 5, 2, 6, 3, 7, 4};
		int[][] new_id2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

		//S0ystem.out.println(Arrays.toString(solution(N)));
		System.out.println(Arrays.toString(solution(new_id, new_id2)));
	}
}
