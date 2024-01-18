package programmersTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test231108_0914_LV2_makeMin {
    public static int solution(int []A, int []B) {
    	int answer = 0;
    	List<Integer> aList = new ArrayList<>();
    	List<Integer> bList = new ArrayList<>();
    	
    	for(int aEle : A) {
    		aList.add(aEle);
    	}

    	for(int bEle : B) {
    		bList.add(bEle);
    	}
    	
    	Collections.sort(aList);
    	Collections.sort(bList);
    	for(int i=0;i<aList.size();i++) {
    		answer += (aList.get(i) * bList.get(aList.size()-(i+1)));
    	}
    	
        return answer;
    }

	public static void main(String[] args){
		int[] a = {1,2};
		int[] b = {3,4};
		
		System.out.println(solution(a, b));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
