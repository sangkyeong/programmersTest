package programmersTest;

import java.util.ArrayList;
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
		ArrayList<Integer> bridgeInCar = new ArrayList<>(bridge_length);
		int bridgeInCarWei = 0;
		int pick = truck.size()-1;
		boolean loopBreak = false;

		while(!truck.isEmpty()) {
			//0으로 채움
			for(int len=0;len<bridge_length;len++) {
				bridgeInCar.add(0);

				//안에있는 요소이동
				if((bridgeInCar.size() > bridge_length) && (bridgeInCar.getFirst() == 0)) {
					bridgeInCar.removeFirst();
					time++;

				//0이아닌 요소가 나갈때 동작
				}else if((bridgeInCar.size() > bridge_length) && (bridgeInCarWei != 0) && (bridgeInCar.getFirst() != 0)) {
					bridgeInCar.removeFirst();
					bridgeInCarWei -= truck.pop();
					if((pick >= 0) && ((bridgeInCarWei+truck.get(pick)) <= weight)) {
						loopBreak = true;
						break;
					}
					time++;

				//모두 다 통과 시 중단
				}else if((truck.isEmpty()) && (bridgeInCarWei == 0)) {
					break;
				}
			}

			//다리위 차들의 총합은 하중을 초과할 수 없음
			while((pick >= 0) && ((bridgeInCarWei+truck.get(pick)) <= weight)) {
				if(loopBreak){
					bridgeInCar.removeLast();
					time++;
				}
				loopBreak = false;
				bridgeInCar.add(truck.get(pick));
				bridgeInCarWei += truck.get(pick);

				if(bridgeInCar.size() >= bridge_length) {
					if(bridgeInCar.getFirst() != 0)
						truck.pop();
					bridgeInCarWei -= bridgeInCar.removeFirst();
					time++;
				}

				if((truck.isEmpty()) && (bridgeInCarWei == 0)) {
					break;
				}

				pick--;
			}
		}

		return time;
	}

	public static void main(String[] args){
		int new_id = 5;
		int new_id2 = 5;
		int[] new_id3 = {1, 1, 1, 1, 1, 2, 2, 2, 2};

		System.out.println(solution(new_id, new_id2, new_id3));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
