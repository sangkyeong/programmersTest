package programmersTest;

import java.util.ArrayList;
import java.util.Arrays;
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
        List<Integer> priceList = new ArrayList<>(Arrays.stream(prices).boxed().collect(Collectors.toList()));
		List<Integer> answer = new ArrayList<>();

		Stack<Integer> stk = new Stack<>();


//스택으로 역순으로 쌓아올린다
		for(int i=prices.length-1;i>=0;i--) {


			if((stk.size() > 1) && (stk.peek() > prices[i])) {
				answer.add(1);
			}else if(stk. < prices[i]){
				answer.add();
			}else{
				answer.add(stk.size());
			}

			stk.add(prices[i]);




		}

		System.out.println(stk);
		System.out.println(answer);

//        for(int i=0;i<prices.length;i++) {
//        	int nowScan = prices[i];
//        	int cnt = 0;
//        	System.out.println("");
//        	for(int j=0;j<priceList.size();j++) {
//        		if(i >= j) continue;
//        		else {
//        			if(nowScan <= priceList.get(j)) {
//        				cnt++;
//        			}else if(nowScan > priceList.get(j)) {
//        				cnt++;
//						answer.add(cnt);
//        				break;
//        			}
//					if(j == priceList.size()-1){
//						answer.add(cnt);
//					}
//
//        		}
//        	}
//        }
//		answer.add(0);
//		System.out.println(answer);
        return answer.stream().mapToInt(i->i).toArray();
	}

	public static void main(String[] args){
		int[] new_id = {1, 2, 3, 2, 3, 1};

		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
