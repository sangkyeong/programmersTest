package programmersTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class test240130_1117_LV2_h_index {
	/**
	 * 프로그래머스_Lv2_H_INDEX
	 *	1. 숫자가 클 수록 불리하기 때문에 배열 끝까지 순회 할 필요 없어보임
	 *	2. 배열 정렬 후 중간까지만 순회?
	 *	3. h번이상 인용 && h번이상 인용된 논문이 h편이상 && 나머지가 h이하 인용수
	 *	4. 이 중 가장 큰 h의 값..
	 *	- 리스트에 배열을 모두 넣고 정렬
	 *	-
	 */
	public static int solution(int[] citations) {
        int answer = 0;
        List<Integer> list = Arrays.stream(citations).sorted().boxed().collect(Collectors.toList());
        Collections.reverse(list);
        System.out.println(list);
        for(int i=list.size()-1;i>0;i--) {
        	if(i <= list.get(0) &&	//h숫자는 배열 안에 가장 큰 인용 수를 넘을 수 없음
        	i <= list.get(i-1) &&		//h번이상 인용된 논문이 h편 이상이어야 함
        	i >= list.get(i)) {		//h번이상 인용된 논문개수들을 배열사이즈에서 뺀 후 index구함, 그 값이 h이하라면 나머지도 h이하임
        		answer = i;
        		break;
        	}
        }

        return answer == 0 ? (list.get(0) == 0 ? 0 : list.size()) : answer;
	}

	public static void main(String[] args){
		int[] new_id = {4, 4, 4};
		//6, 5, 5, 5, 3, 2, 1, 0	4
		//0, 1, 2, 2, 2		1, 4, 5			2
		//5, 6, 7 		3

		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
