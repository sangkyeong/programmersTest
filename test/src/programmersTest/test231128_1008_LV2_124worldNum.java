package programmersTest;

import java.util.Stack;

public class test231128_1008_LV2_124worldNum {
	static Stack<Integer> stk= new Stack<>();
	static String answer = "";
    public static String solution(int n) {
    	if(n > 1) {
	    	if((n % 3) == 0) {
	    		stk.push(4);
	    		solution((n / 3)-1);
	    	}else {
	    		stk.push(n % 3);
	    		solution(n / 3);
	    	}
    	}else if(n != 0){
    		stk.push(n);
    	}
    	while(stk.size() != 0) {
    		answer += stk.pop();
    	}
         return answer;
    }
    
	public static void main(String[] args){
		int new_id = 18;
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
