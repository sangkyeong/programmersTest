package programmersTest;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

public class test240201_1709_LV2_funDev {
	/**
	 * 프로그래머스_Lv2_기능개발
	 *	1.(100-progresses[x])/speeds[x] => queue
	 *	2. 단, 나누고 나머지가 있을경우 +1
	 *	3. 큐에 요소 중 뒤요소와 비교해서 크면 현재요소만, 이하면 뒤요소와 같이 출력
	 */
	public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> days = new LinkedList<>();
        LinkedHashMap<Integer,Integer> cntList = new LinkedHashMap<>();

        for(int i=0;i<progresses.length;i++) {
        	int num = (100-progresses[i])/speeds[i];
        	int day = ((100-progresses[i])%speeds[i]) > 0 ? ++num : num;

        	if((days.size() >= 1) && (days.peek() >= day)) {
        		if(!cntList.containsKey(days.peek())) {
        			cntList.put(days.peek(), 2);
        		}else {
        			cntList.put(days.peek(), cntList.get(days.peek())+1);
        		}
        	}else if((days.size() >= 1) && days.peek() < day) {
        		if(!cntList.containsKey(days.peek())) {
        			cntList.put(days.peek(), 1);
        		}else {
        			days.clear();
        			cntList.put(day, 1);
        			days.add(day);
        			continue;
        		}
        		days.poll();
        	}
        	days.add(day);

        }
        System.out.println(days);
        System.out.println(cntList);

        if(progresses.length != cntList.values().stream().mapToInt(i->i).sum()) {
        	cntList.put(days.peek(), 1);
        };


        return answer = cntList.values().stream().mapToInt(i->i).toArray();
	}

	public static void main(String[] args){
		int[] new_id = {99, 98};
		int[] new_id2 = {1, 1};

		/**
		 * 1, 95, 95, 95
		 * 99, 1, 1, 1
		 *
		 * 1, 3
		 *
		 *
		 * 99, 98
		 * 1, 1
		 */

		System.out.println(solution(new_id, new_id2));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
