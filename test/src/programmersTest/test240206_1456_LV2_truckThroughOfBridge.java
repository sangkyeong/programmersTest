package programmersTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class test240206_1456_LV2_truckThroughOfBridge {
	/**
	 * 프로그래머스_Lv2_다리를 지나는 트럭
	 *	1. 다리위 0이어야 인정
	 *	2. 초는 계속 증가
	 *	3. 다리위 사이즈는 큐로?
	 *	4. 출발전 size는 truck_weight 길이로
	 *
	 * 다리위 차들의 총합은 하중을 초과할수없음
	 * 출발전 사이즈는 0이어야함 (트럭 weight길이 끝까지 도달해야함), 다리위 사이즈가 0이어야함
	 * 초가 증가할때마다 다리위 차의 위치는 앞으로 한칸가야함
	 */
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int time = 0;

		//트럭정보를 스택에 쌓음
		Stack<Integer> truck = new Stack<>();
		for(int i=truck_weights.length-1;i>=0;i--) {
			truck.add(truck_weights[i]);
		}

		//다리위 차 대수
		Queue<Integer> bridgeInCar = new LinkedList<>();
		int bridgeInCarWei = 0;
		int pick = truck.size()-1;

		while(truck.size() > 0) {
			int bridgeWei = 0;

			//다리위 차들의 총합은 하중을 초과할 수 없음
			while((pick >= 0) && ((bridgeInCarWei+truck.get(pick)) <= weight)) {
				bridgeInCar.add(truck.get(pick));
				bridgeInCarWei += truck.get(pick);

				//현재 차 무게
				if(bridgeInCar.size() != 0)
				bridgeWei = truck.get(pick);

				pick--;
			}

			//초가 증가할 때마다 다리위 차의 위치는 앞으로 한 칸 가야 함
			for(int len=0;len<bridge_length;len++) {
				time++;

				if(len == bridge_length-1) {
					//다리위 통과하는 차의 무게빼기
					bridgeInCar.poll();
					bridgeInCarWei -= truck.pop();
				}
			}
		}

		return time;
	}

	public static void main(String[] args){
		int new_id = 100;
		int new_id2 = 100;
		int[] new_id3 = {10};

		System.out.println(solution(new_id, new_id2, new_id3));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
