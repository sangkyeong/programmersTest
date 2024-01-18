package programmersTest;

import java.util.Stack;

public class test231108_0943_LV2_correctGwalHo {
    public static boolean solution(String s) {
    	boolean answer = false;
    	
    	if(!s.startsWith(")") && !s.endsWith("(") && (s.length() % 2) == 0) {
	    	Stack<Character> stk = new Stack<>();
	    	char[] str = s.toCharArray(); //split을 쓰는것보다 효율적
	    	for(int i=0;i<s.length();i++) {
	    		stk.push(str[i]);
	    		if(str[i] == ')') {
	    			stk.pop();
	    			if(stk.empty()){
	    				break;
	    			}
	    			stk.pop();
	    			if(i== (s.length()-1) && stk.empty()){
	    				answer = true;
	    			}
	    		}
	    	}
    	}
    	
        return answer;
    }

	public static void main(String[] args){
		String s = "()()()()()())()";
		
		System.out.println(solution(s));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
