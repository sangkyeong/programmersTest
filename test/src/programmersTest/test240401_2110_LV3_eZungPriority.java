package programmersTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class test240401_2110_LV3_eZungPriority {
    public static int[] solution(String[] operations) {
		int[] answer = {0,0};
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();

        for (String operation : operations) {
            String[] mem = operation.split(" ");
            for (int j = 0; j < mem.length; j++) {
                switch (mem[j]) {
                    case "I":
						pq.add(Integer.parseInt(mem[j + 1]));
						pq2.add(Integer.parseInt(mem[j + 1]));
                        break;
                    case "D":
						if ((!pq.isEmpty()) && (mem[j + 1].equals("1"))) {
							pq2.remove(pq.peek());
							pq.remove();
						} else if ((!pq.isEmpty()) && (mem[j + 1].equals("-1"))) {
                            pq.remove(pq2.peek());
							pq2.remove();
                        }
                        break;
                }
            }
        }
		if(!pq.isEmpty()) {
			answer[0] = pq.peek();
			answer[1] = pq2.peek();
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	public static void main(String[] args){
		String[] new_id = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
		
		System.out.println(solution(new_id));
		//System.out.println(Arrays.toString(solution(N)));
	}
}
