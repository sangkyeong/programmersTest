package programmersTest;

import java.util.Arrays;

public class test231107_1519_LV2_jadenCase {
    public static String solution(String s) {
    	String answer = "";
    	System.out.println(Arrays.toString(s.split("")));
    	String[] list = s.split("");
    	for(int i=0;i<list.length;i++) {
    		System.out.println(list[i]);
    		if(list[i].length() != 0) {
	    		if(i==0 || list[i-1].equals(" ")) {
	    			list[i] = list[i].toUpperCase();
	    		}else {
	    			list[i] = list[i].toLowerCase();
	    		}
	    		answer += list[i];
    		}else {
    			answer += " "; 
    			continue;
    		}
    	}
        return answer;
    }

	public static void main(String[] args){
		String new_id = "i am developer   ";

		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
