package programmersTest;

import java.util.Arrays;
import java.util.Stack;

public class test231123_1643_LV1_sameNumRemove {
    public static int[] solution(int []arr) {
        Stack<Integer> stk = new Stack<>();
        for(int num : arr) {
        	if(stk.size() != 0 && stk.get(stk.size()-1) == num) continue;
        	else if(stk.size() == 0) stk.push(num);
        	else stk.push(num);
        }
        
        int[] answer = new int[stk.size()];
        for(int i=0;i<stk.size();i++) {
        	answer[i] = stk.get(i);
        }
        return answer;
    }

	public static void main(String[] args){
		int[] new_id = {4,4,4,3,3};
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
