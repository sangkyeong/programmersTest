package programmersTest;

import java.util.Stack;

public class test231123_1115_LV2_coupleRemove {
    public static int solution(String s){   
    	Stack<String> stk = new Stack<>();
    	for(String str : s.split("")) {
    		if(stk.size() != 0 && stk.get(stk.size()-1).equals(str)) {
    			stk.pop();
    		}else {
    			stk.push(str);
    		}
    		
    	}
    	
        return stk.size() == 0 ? 1 : 0;
    }

	public static void main(String[] args){
		String new_id = "baabaa";
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
