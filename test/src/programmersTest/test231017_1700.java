package programmersTest;

import java.util.Arrays;

public class test231017_1700 {
	
	public static String solution(String code) {
        String answer = "";
        String mode = "0";
        for(int i = 0;i<code.length();i++) {
        	if(code.charAt(i) == '1') {
        		mode = mode == "1" ? "0" : "1";
        	}
        	if(mode == "0" && code.charAt(i) != '1' && i%2==0) {
        		answer += code.charAt(i); 
        	}else if(mode == "1" && code.charAt(i) != '1' && i%2==1) {
        		answer += code.charAt(i);
        	}
        }

        return answer = answer == "" ? "EMPTY" : answer;
    }

	public static void main(String[] args) {
		String code = "abc1abc1abc";
		
		System.out.println(solution(code));
		//System.out.println(Arrays.toString(solution(arr, query)));
	}

}
