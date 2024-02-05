package programmersTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class test240202_1436_LV2_stockPrice {
	/**
	 * 프로그래머스_Lv2_주식가격
	 *	1. 마지막은 항상 0
	 *	2. 똑같으면 유지
	 *	3. 떨어지더라도 최소 1
	 *
	 *	- 요소순회해서 값 비교
	 *	- 현재값 > 스캔중인거 => 1
	 *	- 현재 < 스캔중인거 => 계속 순회진행, i++된거 return
	 */
	public static int[] solution(int[] prices) {
		List<Integer> answer = new ArrayList<>();
		Stack<Integer> stk = new Stack<>();

		//스택으로 역순으로 쌓아올린다
		for(int i=prices.length-1;i>=0;i--) {
			//쌓인 숫자 마지막이 스캔중인 것 이상일때
			if((stk.size() > 0) && (stk.peek() >= prices[i])) {
				//스캔중인 숫자
				int scan = prices[i];

				//쌓인스택 중 스캔중인 숫자보다 작은 수들
				List<Integer> lowerNums = stk.stream().filter(f -> f < scan).mapToInt(k->k).boxed().collect(Collectors.toList());
				if(stk.peek() > prices[i]) {
					if((lowerNums.size() != 0) && (stk.lastIndexOf(lowerNums.get(lowerNums.size()-1)) != -1)) {

						answer.add(stk.size()-stk.lastIndexOf(lowerNums.get(lowerNums.size()-1)));

						System.out.println("scan중 "+prices[i]);
						System.out.println("scan보다 작은거 자리 번호"+stk.lastIndexOf(lowerNums.get(lowerNums.size()-1)));
					}else{
						answer.add(stk.size());
					}
				}else if(stk.peek() == prices[i]) {
					answer.add(stk.size());
				}
			}else if((stk.size() > 0) && (stk.peek() < prices[i])){	//쌓인 숫자 마지막이 스캔중인 것 미만일때
				answer.add(1);
			}else{
				answer.add(stk.size());
			}
			stk.add(prices[i]);
		}

		System.out.println("stk    "+stk);
		System.out.println("answer "+answer);
		Collections.reverse(answer);

        return answer.stream().mapToInt(i->i).toArray();
	}

	public static void main(String[] args){
		int[] new_id = {1, 2, 3, 4, 5, 6, 1, 1, 2, 3, 1, 2, 3};

		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
