package programmersTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test240401_2110_LV3_eZungPriority {
    public static int[] solution(String[] operations) {
		int[] answer = {0,0};
		ArrayList<Integer> list = new ArrayList<>();

        for (String operation : operations) {
            String[] mem = operation.split(" ");
            for (int j = 0; j < mem.length; j++) {
                switch (mem[j]) {
                    case "I":
                        list.add(Integer.parseInt(mem[j + 1]));
                        Collections.sort(list);
                        break;
                    case "D":
						if ((!list.isEmpty()) && (mem[j + 1].equals("1"))) {
							list.removeLast();
						} else if ((!list.isEmpty()) && (mem[j + 1].equals("-1"))) {
                            list.removeFirst();
                        }
                        break;
                }

            }
        }

		if(!list.isEmpty()){
			answer[0] = list.getLast();
			answer[1] = list.getFirst();
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	public static void main(String[] args){
		String[] new_id = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
