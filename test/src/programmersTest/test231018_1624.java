package programmersTest;

import java.util.ArrayList;
import java.util.Arrays;

public class test231018_1624 {
	
    public static int[] solution(int l, int r) {
    	int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        String idx = "0";
        for(int i=l;i<=r;i++) {
        	idx = Integer.toString(i);
        	if(!idx.contains("1") && !idx.contains("2") && !idx.contains("3") && !idx.contains("4") 
        			&& !idx.contains("6") && !idx.contains("7") && !idx.contains("8") && !idx.contains("9")) {
        		list.add(i);
        	}
        }
        if(list.size() != 0){
            answer = new int[list.size()];
            for(int cnt=0;cnt<list.size();cnt++) {
                answer[cnt] = list.get(cnt);
            }
        }else{
            answer = new int[1]; 
            answer[0] = -1;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		int l = 1;
		int r = 555;
		
		System.out.println(Arrays.toString(solution(l, r)));
	}

}
