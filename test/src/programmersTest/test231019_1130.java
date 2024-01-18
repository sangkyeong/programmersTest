package programmersTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class test231019_1130 {
    public static int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        //순위와 true여부 담은 맵
        HashMap<Integer, Integer> trueMap = new HashMap<>();
        int cnt = 1;
        for(int i = 0;i < rank.length;i++) {
        	
        	if(attendance[i]) {
        		trueMap.put(i, rank[i]);
        	}
        }
        
        List<Integer> keySet = new ArrayList<>(trueMap.keySet());

        // Value 값으로 오름차순 정렬
        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return trueMap.get(o1).compareTo(trueMap.get(o2));
            }
        });
        answer = 10000 * keySet.get(0) + 100 * keySet.get(1) + keySet.get(2) ;
        return answer;
    }

	public static void main(String[] args) {
		int[] rank = {3, 7, 2, 5, 4, 6, 1};
		boolean[] attendance = {false, true, true, true, true, false, false};
		
		System.out.println(solution(rank, attendance));
		//System.out.println(Arrays.toString(solution(N)));
	}

}
