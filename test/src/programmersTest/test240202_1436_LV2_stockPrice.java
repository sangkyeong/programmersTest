package programmersTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        int[] answer = {};
        List<Integer> priceList = new ArrayList<>(Arrays.stream(prices).boxed().collect(Collectors.toList()));

        for(int i=0;i<prices.length;i++) {
        	int nowScan = prices[i];
        	int cnt = 0;
        	System.out.println("");
        	for(int j=0;j<priceList.size();j++) {
        		if(i >= j) continue;
        		else {
        			if(nowScan <= priceList.get(j)) {
        				cnt++;
        				System.out.println("cnt "+cnt);
        			}else if(nowScan > priceList.get(j)) {
        				cnt++;
        				System.out.println("cnt "+cnt);
        				break;
        			}

        		}
        	}
        }

        return answer;
	}

	public static void main(String[] args){
		int[] new_id = {1, 2, 3, 2, 3, 1};

		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
