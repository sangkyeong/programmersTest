package programmersTest;

import java.util.ArrayList;
import java.util.Arrays;

public class test231018_1551 {
	
    public static int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;
        for(int put : arr) {
        	list.add(put);
        }
        System.out.println(list);
        for(int i=0;i<query.length;i++) {
        	if(i%2 == 0 && query[i]+1<list.size())
        		list.subList(query[i]+1, list.size()).clear();
        	else if(i%2 == 1 && query[i]-1 >= 0)
        		list.subList(0, query[i]).clear();
        }
        answer = new int[list.size()];
        for(int temp : list) {
        	answer[idx++] = temp;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 5};
		int[] query = {4, 1, 2};
		
		System.out.println(Arrays.toString(solution(arr, query)));
	}

}
