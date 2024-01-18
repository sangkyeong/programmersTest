package programmersTest;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class test231127_1005_LV2_engWordGame {
    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        //중복단어 체크
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        int step = 0;
        for(int i=0;i<words.length;i++) {
        	//중복단어체크- 전 사이즈 측정
        	int beforeSiz = lhs.size();
    		lhs.add(words[i]);
    		if((i) % n == 0) step++;
        	if(i>0) {
        		System.out.println(words[i-1].charAt(words[i-1].length()-1)+" / "+words[i].charAt(0));
        		//중복단어체크-추가 후  사이즈 측정
        		int afterSiz = lhs.size();
        		if((words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0))
        				|| beforeSiz == afterSiz) {
        			answer[0] = (i+1) % n == 0 ? n : (i+1) % n;
        			answer[1] = step;
        			break;
        		}
        	}
        }
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }

	public static void main(String[] args){
		int a = 2;
		String[] b = {"hello", "one", "even", "never", "now", "world", "draw"};
		
		System.out.println(solution(a, b));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
